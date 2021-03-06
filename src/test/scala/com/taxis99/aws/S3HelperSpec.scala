package com.taxis99.aws

import org.mockito.Mockito._
import org.mockito.Matchers._
import org.scalatest.{ Finders, MustMatchers, WordSpec }

import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.services.s3.model.ObjectListing
import com.amazonaws.services.s3.model.S3ObjectSummary

class S3HelperSpec extends WordSpec with MustMatchers {

  object S3Helper extends S3Helper(accessKey = "x", secretKey = "y", bucketName = "bucket", endpoint = "localhost:1234") {
    override def createClient() = {
      val client = mock(classOf[AmazonS3Client])
      val objectListing = mock(classOf[ObjectListing])
      when(objectListing.getObjectSummaries())
        .thenReturn(new java.util.ArrayList[S3ObjectSummary]())
      when(client.listObjects(anyString(), anyString()))
        .thenReturn(objectListing)
      client
    }
  }

  "S3Helper" must {
    "receive nothing on empty bucket" in {
      S3Helper.listFiles("prefix") must have size(0)
    }
  }

}