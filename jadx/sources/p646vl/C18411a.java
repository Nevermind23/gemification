package p646vl;

import kotlin.jvm.internal.C41550z;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p341ge.bog.mobilebank.bnpl.presentation.categories.BnplCategoriesActivity;

/* renamed from: vl.a */
public final /* synthetic */ class C18411a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C41550z f51868d;

    /* renamed from: e */
    public final /* synthetic */ TabsView f51869e;

    public /* synthetic */ C18411a(C41550z zVar, TabsView tabsView) {
        this.f51868d = zVar;
        this.f51869e = tabsView;
    }

    public final void run() {
        BnplCategoriesActivity.m51444P2(this.f51868d, this.f51869e);
    }
}
