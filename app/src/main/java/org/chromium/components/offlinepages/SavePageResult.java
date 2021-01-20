
// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/offline_pages/core/offline_page_types.h

package org.chromium.components.offlinepages;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    SavePageResult.SUCCESS, SavePageResult.CANCELLED, SavePageResult.DEVICE_FULL,
    SavePageResult.CONTENT_UNAVAILABLE, SavePageResult.ARCHIVE_CREATION_FAILED,
    SavePageResult.STORE_FAILURE, SavePageResult.ALREADY_EXISTS, SavePageResult.SKIPPED,
    SavePageResult.SECURITY_CERTIFICATE_ERROR, SavePageResult.ERROR_PAGE,
    SavePageResult.INTERSTITIAL_PAGE, SavePageResult.DIGEST_CALCULATION_FAILED,
    SavePageResult.FILE_MOVE_FAILED, SavePageResult.ADD_TO_DOWNLOAD_MANAGER_FAILED,
    SavePageResult.PERMISSION_DENIED, SavePageResult.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface SavePageResult {
  int SUCCESS = 0;
  int CANCELLED = 1;
  int DEVICE_FULL = 2;
  int CONTENT_UNAVAILABLE = 3;
  int ARCHIVE_CREATION_FAILED = 4;
  int STORE_FAILURE = 5;
  int ALREADY_EXISTS = 6;
  /**
   * Certain pages, i.e. file URL or NTP, will not be saved because these are already locally
   * accessible.
   */
  int SKIPPED = 7;
  int SECURITY_CERTIFICATE_ERROR = 8;
  /**
   * Returned when we detect trying to save a chrome error page.
   */
  int ERROR_PAGE = 9;
  /**
   * Returned when we detect trying to save a chrome interstitial page.
   */
  int INTERSTITIAL_PAGE = 10;
  /**
   * Failed to compute digest for the archive file.
   */
  int DIGEST_CALCULATION_FAILED = 11;
  /**
   * Unable to move the file into a public directory.
   */
  int FILE_MOVE_FAILED = 12;
  /**
   * Unable to add the file to the system download manager.
   */
  int ADD_TO_DOWNLOAD_MANAGER_FAILED = 13;
  /**
   * Unable to get write permission on public directory.
   */
  int PERMISSION_DENIED = 14;
  int MAX_VALUE = 14;
}