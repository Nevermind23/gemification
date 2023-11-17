package com.salesforce.marketingcloud.sfmcsdk.util;

import java.io.File;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class FileUtilsKt$wipeModuleFiles$5$1 extends C41537m implements C43064a {
    final /* synthetic */ File $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FileUtilsKt$wipeModuleFiles$5$1(File file) {
        super(0);
        this.$it = file;
    }

    public final String invoke() {
        return C41536l.m120497q("Deleting SharedPreferences File: ", this.$it.getName());
    }
}
