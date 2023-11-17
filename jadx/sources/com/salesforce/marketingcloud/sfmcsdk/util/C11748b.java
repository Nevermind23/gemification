package com.salesforce.marketingcloud.sfmcsdk.util;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.salesforce.marketingcloud.sfmcsdk.util.b */
public final /* synthetic */ class C11748b implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f34073a;

    public /* synthetic */ C11748b(String str) {
        this.f34073a = str;
    }

    public final boolean accept(File file, String str) {
        return FileUtilsKt.m125027wipeModuleFiles$lambda2(this.f34073a, file, str);
    }
}
