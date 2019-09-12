/*
 * Copyright (c) 2018 The Linux Foundation. All rights reserved.
 * Not a contribution.
 */

/*
 * Copyright (C) 2006 The Android Open Source Project
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

package org.codeaurora.telephony.utils;

/**
 * See also RIL_CallForwardInfo in include/telephony/ril.h
 *
 * {@hide}
 */
public class CallForwardInfo {
    private static final String TAG = "CallForwardInfo";

    public int             status;      /*1 = active, 0 = not active */
    public int             reason;      /* from TS 27.007 7.11 "reason" */
    public int             serviceClass; /* Saum of CommandsInterface.SERVICE_CLASS */
    public int             toa;         /* "type" from TS 27.007 7.11 */
    public String          number;      /* "number" from TS 27.007 7.11 */
    public int             timeSeconds; /* for CF no reply only */

    @Override
    public String toString() {
        return "[CallForwardInfo: status=" + (status == 0 ? " not active " : " active ")
                + ", reason= " + reason + ", serviceClass= " + serviceClass
                + ", timeSec= " + timeSeconds + " seconds" + "]"
                + ", number=" + Log.pii(number) + "]";
    }
}
