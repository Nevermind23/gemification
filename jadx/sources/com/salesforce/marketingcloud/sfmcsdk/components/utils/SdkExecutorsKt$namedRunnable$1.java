package com.salesforce.marketingcloud.sfmcsdk.components.utils;

import ue1.C43064a;

public final class SdkExecutorsKt$namedRunnable$1 extends NamedRunnable {
    final /* synthetic */ C43064a $block;
    final /* synthetic */ String $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SdkExecutorsKt$namedRunnable$1(C43064a aVar, String str, Object[] objArr) {
        super(str, objArr);
        this.$block = aVar;
        this.$name = str;
    }

    /* access modifiers changed from: protected */
    public void execute() {
        this.$block.invoke();
    }
}
