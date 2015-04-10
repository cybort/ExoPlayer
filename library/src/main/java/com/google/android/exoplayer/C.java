/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.exoplayer;

import android.media.MediaCodec;
import android.media.MediaExtractor;

/**
 * Defines constants that are generally useful throughout the library.
 */
public final class C {

  /**
   * Represents an unknown microsecond time or duration.
   */
  public static final long UNKNOWN_TIME_US = -1L;

  /**
   * The number of microseconds in one second.
   */
  public static final long MICROS_PER_SECOND = 1000000L;

  /**
   * Represents an unbounded length of data.
   */
  public static final int LENGTH_UNBOUNDED = -1;

  /**
   * The name of the UTF-8 charset.
   */
  public static final String UTF8_NAME = "UTF-8";

  /**
   * @see MediaExtractor#SAMPLE_FLAG_SYNC
   */
  @SuppressWarnings("InlinedApi")
  public static final int SAMPLE_FLAG_SYNC = MediaExtractor.SAMPLE_FLAG_SYNC;

  /**
   * @see MediaExtractor#SAMPLE_FLAG_ENCRYPTED
   */
  @SuppressWarnings("InlinedApi")
  public static final int SAMPLE_FLAG_ENCRYPTED = MediaExtractor.SAMPLE_FLAG_ENCRYPTED;

  /**
   * Indicates that a sample should be decoded but not rendered.
   */
  public static final int SAMPLE_FLAG_DECODE_ONLY = 0x8000000;

  /**
   * @see MediaCodec#CRYPTO_MODE_AES_CTR
   */
  @SuppressWarnings("InlinedApi")
  public static final int CRYPTO_MODE_AES_CTR = MediaCodec.CRYPTO_MODE_AES_CTR;

  private C() {}

}
