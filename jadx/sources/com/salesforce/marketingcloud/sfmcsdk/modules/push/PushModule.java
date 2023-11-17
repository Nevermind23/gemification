package com.salesforce.marketingcloud.sfmcsdk.modules.push;

import com.salesforce.marketingcloud.sfmcsdk.modules.Module;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PushModule extends Module {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "~$PushSdkModule";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public String getName() {
        return "PUSH";
    }
}
