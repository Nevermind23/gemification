package com.salesforce.marketingcloud.sfmcsdk.util;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class ApplicationUtils$getApplicationVersion$1 extends C41537m implements C43064a {
    public static final ApplicationUtils$getApplicationVersion$1 INSTANCE = new ApplicationUtils$getApplicationVersion$1();

    ApplicationUtils$getApplicationVersion$1() {
        super(0);
    }

    public final String invoke() {
        return "Failed to get VERSION_NAME from the application's BuildConfig.";
    }
}
