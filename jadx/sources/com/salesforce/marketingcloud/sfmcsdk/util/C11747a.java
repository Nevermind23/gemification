package com.salesforce.marketingcloud.sfmcsdk.util;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.salesforce.marketingcloud.sfmcsdk.util.a */
public final /* synthetic */ class C11747a implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f34072a;

    public /* synthetic */ C11747a(String str) {
        this.f34072a = str;
    }

    public final boolean accept(File file, String str) {
        return FileUtilsKt.m125026wipeModuleFiles$lambda0(this.f34072a, file, str);
    }
}
