package uk0;

import al0.C19262c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b00.C19305k;
import b41.C31128a;
import b41.C31132b;
import ba1.C10145d;
import cl0.C19767b;
import dl0.C20038a;
import dl0.C20039b;
import g11.C32041b;
import g91.C32303f;
import g91.C32343x;
import h00.C24849e;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import j41.C36728a;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import n20.C26360b;
import n41.C37353c;
import ok0.C27028d;
import ok0.C27031g;
import p017b.C2106d;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectBillSplitMoneyRequestActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.financemanagement.FinanceManagementActivity;
import p341ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileActivity2;
import p341ge.bog.mobilebank.cleanarch.settings.presentation.SecuritySettingsActivity;
import p341ge.bog.mobilebank.hubmenu.presentation.view.SearchItemsView;
import p341ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper;
import p341ge.bog.mobilebank.model.usrinfo.ClientStarInfo;
import p341ge.bog.mobilebank.model.usrinfo.PlusStatusState;
import p341ge.bog.mobilebank.model.usrinfo.UserInfoConsts;
import p341ge.bog.mobilebank.p975ui.activities.DDSTOListActivity;
import p341ge.bog.mobilebank.p975ui.activities.ExchangeActivity;
import p341ge.bog.mobilebank.p975ui.activities.ManageAccountsAndCardsActivity;
import p341ge.bog.mobilebank.p975ui.activities.ManagePensionFundsActivity;
import p341ge.bog.mobilebank.p975ui.activities.SmsNotifManagerActivity;
import p341ge.bog.mobilebank.settings.presentation.activity.SettingsActivity;
import p341ge.bog.mobilebank.shared.P2PFlowType;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow;
import p725cr.C19788a;
import pk0.C27551a;
import pk0.C27585b;
import pk0.C27587c;
import pk0.C27588d;
import pk0.C27594e;
import q31.C38122f;
import q31.C38125h;
import r31.C38281a;
import sk0.C28239b;
import ue1.C43064a;
import ue1.C43075l;
import vk0.C29108a;
import z21.C40141a;

/* renamed from: uk0.h */
public final class C28808h extends C28801a {

    /* renamed from: k */
    public static final C28809a f73635k = new C28809a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C28239b f73636g;

    /* renamed from: h */
    private final C41217g f73637h;

    /* renamed from: i */
    public C36728a f73638i;

    /* renamed from: j */
    private final C0173b f73639j;

    /* renamed from: uk0.h$a */
    public static final class C28809a {
        private C28809a() {
        }

        public /* synthetic */ C28809a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C28808h mo68543a(boolean z) {
            C28808h hVar = new C28808h();
            hVar.setViewPagerFragment(z);
            return hVar;
        }
    }

    /* renamed from: uk0.h$a0 */
    static final class C28810a0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73640d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28810a0(C28808h hVar) {
            super(1);
            this.f73640d = hVar;
        }

        /* renamed from: a */
        public final void mo68544a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73640d.m88374l3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68544a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$a1 */
    static final class C28811a1 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28811a1(C28808h hVar) {
            super(1);
            this.f73641d = hVar;
        }

        /* renamed from: a */
        public final void mo68545a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73641d.m88409x3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68545a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$b */
    static final class C28812b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C28812b f73642d = new C28812b();

        C28812b() {
            super(1);
        }

        public final CharSequence invoke(String str) {
            C41536l.m120489i(str, "it");
            if (!(str.length() > 0)) {
                return str;
            }
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
            return upperCase + substring;
        }
    }

    /* renamed from: uk0.h$b0 */
    static final class C28813b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73643d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28813b0(C28808h hVar) {
            super(1);
            this.f73643d = hVar;
        }

        /* renamed from: a */
        public final void mo68547a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73643d.m88404v3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68547a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$b1 */
    static final class C28814b1 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73644d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28814b1(C28808h hVar) {
            super(1);
            this.f73644d = hVar;
        }

        /* renamed from: a */
        public final void mo68548a(C31128a aVar) {
            C28808h hVar = this.f73644d;
            C41536l.m120488h(aVar, "it");
            hVar.m88391r2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68548a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$c */
    static final class C28815c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73645d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28815c(C28808h hVar) {
            super(1);
            this.f73645d = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            this.f73645d.m88292F2(bool != null ? bool.booleanValue() : false);
        }
    }

    /* renamed from: uk0.h$c0 */
    static final class C28816c0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73646d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28816c0(C28808h hVar) {
            super(1);
            this.f73646d = hVar;
        }

        /* renamed from: a */
        public final void mo68550a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73646d.m88328S2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68550a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$c1 */
    static final class C28817c1 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73647d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28817c1(C28808h hVar) {
            super(1);
            this.f73647d = hVar;
        }

        /* renamed from: a */
        public final void mo68551a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73647d.m88349Z2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68551a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$d */
    static final class C28818d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73648d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28818d(C28808h hVar) {
            super(1);
            this.f73648d = hVar;
        }

        /* renamed from: a */
        public final void mo68552a(boolean z) {
            this.f73648d.m88394s2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68552a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$d0 */
    static final class C28819d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73649d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28819d0(C28808h hVar) {
            super(1);
            this.f73649d = hVar;
        }

        /* renamed from: a */
        public final void mo68553a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73649d.m88371k3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68553a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$d1 */
    static final class C28820d1 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73650d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28820d1(C28808h hVar) {
            super(1);
            this.f73650d = hVar;
        }

        /* renamed from: a */
        public final void mo68554a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73650d.m88334U2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68554a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$e */
    static final class C28821e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73651d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28821e(C28808h hVar) {
            super(1);
            this.f73651d = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "error");
            this.f73651d.handleError(th);
        }
    }

    /* renamed from: uk0.h$e0 */
    static final class C28822e0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73652d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28822e0(C28808h hVar) {
            super(1);
            this.f73652d = hVar;
        }

        /* renamed from: a */
        public final void mo68556a(String str) {
            C41536l.m120489i(str, "appPackageName");
            this.f73652d.m88340W2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68556a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$e1 */
    static final class C28823e1 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28823e1(C28808h hVar) {
            super(1);
            this.f73653d = hVar;
        }

        /* renamed from: a */
        public final void mo68557a(boolean z) {
            this.f73653d.m88298H3(Boolean.valueOf(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68557a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$f */
    static final class C28824f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73654d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28824f(C28808h hVar) {
            super(1);
            this.f73654d = hVar;
        }

        /* renamed from: a */
        public final void mo68558a(C27551a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f73654d.m88289E2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68558a((C27551a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$f0 */
    static final class C28825f0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28825f0(C28808h hVar) {
            super(1);
            this.f73655d = hVar;
        }

        /* renamed from: a */
        public final void mo68559a(String str) {
            C41536l.m120489i(str, "appPackageName");
            this.f73655d.m88346Y2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68559a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$f1 */
    static final class C28826f1 implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f73656a;

        C28826f1(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f73656a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f73656a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f73656a.invoke(obj);
        }
    }

    /* renamed from: uk0.h$g */
    static final class C28827g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28827g(C28808h hVar) {
            super(1);
            this.f73657d = hVar;
        }

        /* renamed from: a */
        public final void mo68562a(C27551a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f73657d.m88289E2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68562a((C27551a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$g0 */
    static final class C28828g0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73658d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28828g0(C28808h hVar) {
            super(1);
            this.f73658d = hVar;
        }

        /* renamed from: a */
        public final void mo68563a(String str) {
            C41536l.m120489i(str, "appPackageName");
            this.f73658d.m88343X2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68563a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$g1 */
    public static final class C28829g1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f73659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28829g1(Fragment fragment) {
            super(0);
            this.f73659d = fragment;
        }

        public final Fragment invoke() {
            return this.f73659d;
        }
    }

    /* renamed from: uk0.h$h */
    static final class C28830h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73660d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28830h(C28808h hVar) {
            super(1);
            this.f73660d = hVar;
        }

        /* renamed from: a */
        public final void mo68564a(C27551a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f73660d.m88289E2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68564a((C27551a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$h0 */
    static final class C28831h0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28831h0(C28808h hVar) {
            super(1);
            this.f73661d = hVar;
        }

        /* renamed from: a */
        public final void mo68565a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73661d.m88297H2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68565a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$h1 */
    public static final class C28832h1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f73662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28832h1(C43064a aVar) {
            super(0);
            this.f73662d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f73662d.invoke();
        }
    }

    /* renamed from: uk0.h$i */
    static final class C28833i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28833i(C28808h hVar) {
            super(1);
            this.f73663d = hVar;
        }

        /* renamed from: a */
        public final void mo68566a(C27551a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f73663d.m88289E2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68566a((C27551a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$i0 */
    static final class C28834i0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28834i0(C28808h hVar) {
            super(1);
            this.f73664d = hVar;
        }

        /* renamed from: a */
        public final void mo68567a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73664d.m88362h3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68567a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$i1 */
    public static final class C28835i1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f73665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28835i1(C41217g gVar) {
            super(0);
            this.f73665d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f73665d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: uk0.h$j */
    static final class C28836j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28836j(C28808h hVar) {
            super(1);
            this.f73666d = hVar;
        }

        /* renamed from: a */
        public final void mo68568a(C27551a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f73666d.m88289E2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68568a((C27551a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$j0 */
    static final class C28837j0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28837j0(C28808h hVar) {
            super(1);
            this.f73667d = hVar;
        }

        /* renamed from: a */
        public final void mo68569a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73667d.m88365i3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68569a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$j1 */
    public static final class C28838j1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f73668d;

        /* renamed from: e */
        final /* synthetic */ C41217g f73669e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28838j1(C43064a aVar, C41217g gVar) {
            super(0);
            this.f73668d = aVar;
            this.f73669e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f73668d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f73669e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: uk0.h$k */
    static final class C28839k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28839k(C28808h hVar) {
            super(1);
            this.f73670d = hVar;
        }

        /* renamed from: a */
        public final void mo68570a(String str) {
            C41536l.m120489i(str, "it");
            this.f73670d.m88309L2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68570a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$k0 */
    static final class C28840k0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73671d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28840k0(C28808h hVar) {
            super(1);
            this.f73671d = hVar;
        }

        /* renamed from: a */
        public final void mo68571a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73671d.m88295G3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68571a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$k1 */
    public static final class C28841k1 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f73672d;

        /* renamed from: e */
        final /* synthetic */ C41217g f73673e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28841k1(Fragment fragment, C41217g gVar) {
            super(0);
            this.f73672d = fragment;
            this.f73673e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f73673e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f73672d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: uk0.h$l */
    static final class C28842l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C28808h f73674d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28842l(C28808h hVar) {
            super(0);
            this.f73674d = hVar;
        }

        public final void invoke() {
            this.f73674d.m88300I2();
        }
    }

    /* renamed from: uk0.h$l0 */
    static final class C28843l0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73675d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28843l0(C28808h hVar) {
            super(1);
            this.f73675d = hVar;
        }

        /* renamed from: a */
        public final void mo68572a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73675d.m88325R2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68572a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$m */
    static final class C28844m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73676d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28844m(C28808h hVar) {
            super(1);
            this.f73676d = hVar;
        }

        /* renamed from: a */
        public final void mo68573a(boolean z) {
            this.f73676d.m88303J2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68573a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$m0 */
    static final class C28845m0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73677d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28845m0(C28808h hVar) {
            super(1);
            this.f73677d = hVar;
        }

        /* renamed from: a */
        public final void mo68574a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73677d.m88386p3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68574a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$n */
    static final class C28846n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73678d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28846n(C28808h hVar) {
            super(1);
            this.f73678d = hVar;
        }

        /* renamed from: a */
        public final void mo68575a(C27588d.C27591c cVar) {
            C41536l.m120489i(cVar, "it");
            this.f73678d.m88312M2(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68575a((C27588d.C27591c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$n0 */
    static final class C28847n0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28847n0(C28808h hVar) {
            super(1);
            this.f73679d = hVar;
        }

        /* renamed from: a */
        public final void mo68576a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73679d.m88287D3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68576a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$o */
    static final class C28848o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73680d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28848o(C28808h hVar) {
            super(1);
            this.f73680d = hVar;
        }

        /* renamed from: a */
        public final void mo68577a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73680d.m88392r3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68577a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$o0 */
    static final class C28849o0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73681d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28849o0(C28808h hVar) {
            super(1);
            this.f73681d = hVar;
        }

        /* renamed from: a */
        public final void mo68578a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C38122f p1 = this.f73681d.m88379n2();
            Context requireContext = this.f73681d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f.C38123a.m112228x(p1, requireContext, (JuniorRequestDataUiModel) null, NavigatorConstants$JuniorFlow.FINANCIAL_NUMBER, false, 8, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68578a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$p */
    static final class C28850p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28850p(C28808h hVar) {
            super(1);
            this.f73682d = hVar;
        }

        /* renamed from: a */
        public final void mo68579a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73682d.m88380n3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68579a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$p0 */
    static final class C28851p0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28851p0(C28808h hVar) {
            super(1);
            this.f73683d = hVar;
        }

        /* renamed from: a */
        public final void mo68580a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73683d.m88290E3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68580a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$q */
    static final class C28852q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73684d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28852q(C28808h hVar) {
            super(1);
            this.f73684d = hVar;
        }

        /* renamed from: a */
        public final void mo68581a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73684d.m88389q3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68581a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$q0 */
    static final class C28853q0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73685d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28853q0(C28808h hVar) {
            super(1);
            this.f73685d = hVar;
        }

        /* renamed from: a */
        public final void mo68582a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73685d.m88412y3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68582a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$r */
    static final class C28854r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73686d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28854r(C28808h hVar) {
            super(1);
            this.f73686d = hVar;
        }

        /* renamed from: a */
        public final void mo68583a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73686d.m88304J3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68583a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$r0 */
    static final class C28855r0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73687d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28855r0(C28808h hVar) {
            super(1);
            this.f73687d = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            ButtonListLargeView buttonListLargeView = this.f73687d.m88376m2().f71623U;
            C41536l.m120488h(bool, "status");
            buttonListLargeView.setBadgeOnButtonVisible(bool.booleanValue());
        }
    }

    /* renamed from: uk0.h$s */
    static final class C28856s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28856s(C28808h hVar) {
            super(1);
            this.f73688d = hVar;
        }

        /* renamed from: a */
        public final void mo68585a(String str) {
            C41536l.m120489i(str, "it");
            this.f73688d.m88406w3(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68585a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$s0 */
    static final class C28857s0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73689d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28857s0(C28808h hVar) {
            super(1);
            this.f73689d = hVar;
        }

        /* renamed from: a */
        public final void mo68586a(C27585b bVar) {
            this.f73689d.m88321P3(bVar.mo66938b(), bVar.mo66937a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68586a((C27585b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$t */
    static final class C28858t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73690d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28858t(C28808h hVar) {
            super(1);
            this.f73690d = hVar;
        }

        /* renamed from: a */
        public final void mo68587a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73690d.m88301I3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68587a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$t0 */
    static final class C28859t0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73691d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28859t0(C28808h hVar) {
            super(1);
            this.f73691d = hVar;
        }

        /* renamed from: a */
        public final void mo68588a(C27587c cVar) {
            C41536l.m120489i(cVar, "profileWrapper");
            this.f73691d.m88278A3(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68588a((C27587c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$u */
    static final class C28860u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73692d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28860u(C28808h hVar) {
            super(1);
            this.f73692d = hVar;
        }

        /* renamed from: a */
        public final void mo68589a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C38122f p1 = this.f73692d.m88379n2();
            Context requireContext = this.f73692d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            p1.mo91605g0(requireContext, new P2PFlowType.P2PTopUp((String) null, 1, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68589a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$u0 */
    static final class C28861u0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73693d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28861u0(C28808h hVar) {
            super(1);
            this.f73693d = hVar;
        }

        /* renamed from: a */
        public final void mo68590a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73693d.m88352a3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68590a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$v */
    static final class C28862v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73694d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28862v(C28808h hVar) {
            super(1);
            this.f73694d = hVar;
        }

        /* renamed from: a */
        public final void mo68591a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73694d.m88331T2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68591a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$v0 */
    static final class C28863v0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73695d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28863v0(C28808h hVar) {
            super(1);
            this.f73695d = hVar;
        }

        /* renamed from: a */
        public final void mo68592a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73695d.m88284C3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68592a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$w */
    static final class C28864w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73696d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28864w(C28808h hVar) {
            super(1);
            this.f73696d = hVar;
        }

        /* renamed from: a */
        public final void mo68593a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73696d.m88281B3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68593a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$w0 */
    static final class C28865w0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73697d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28865w0(C28808h hVar) {
            super(1);
            this.f73697d = hVar;
        }

        /* renamed from: a */
        public final void mo68594a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73697d.m88383o3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68594a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$x */
    static final class C28866x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73698d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28866x(C28808h hVar) {
            super(1);
            this.f73698d = hVar;
        }

        /* renamed from: a */
        public final void mo68595a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73698d.m88401u3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68595a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$x0 */
    static final class C28867x0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73699d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28867x0(C28808h hVar) {
            super(1);
            this.f73699d = hVar;
        }

        /* renamed from: a */
        public final void mo68596a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73699d.m88377m3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68596a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$y */
    static final class C28868y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73700d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28868y(C28808h hVar) {
            super(1);
            this.f73700d = hVar;
        }

        /* renamed from: a */
        public final void mo68597a(C20038a aVar) {
            C28808h hVar = this.f73700d;
            C41536l.m120488h(aVar, "bankingProductAppearance");
            hVar.m88332T3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68597a((C20038a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$y0 */
    static final class C28869y0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28869y0(C28808h hVar) {
            super(1);
            this.f73701d = hVar;
        }

        /* renamed from: a */
        public final void mo68598a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73701d.m88326R3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68598a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$z */
    static final class C28870z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28870z(C28808h hVar) {
            super(1);
            this.f73702d = hVar;
        }

        /* renamed from: a */
        public final void mo68599a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73702d.m88337V2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68599a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: uk0.h$z0 */
    static final class C28871z0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28808h f73703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28871z0(C28808h hVar) {
            super(1);
            this.f73703d = hVar;
        }

        /* renamed from: a */
        public final void mo68600a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f73703d.m88368j3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68600a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    public C28808h() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C28832h1(new C28829g1(this)));
        this.f73637h = C1514j0.m5374c(this, C41520a0.m120436b(HubViewModel$ViewModel.class), new C28835i1(a), new C28838j1((C43064a) null, a), new C28841k1(this, a));
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C28805e(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f73639j = registerForActivityResult;
    }

    /* renamed from: A2 */
    private final void m88277A2() {
        m88376m2().f71618P.setText(C32343x.m95388F("text.hub.item.banking.products", new Object[0]));
        m88376m2().f71619Q.setText(C32343x.m95388F("text.hub.item.nonbanking.products", new Object[0]));
        m88376m2().f71622T.setText(C32343x.m95388F("text.hub.item.transactions", new Object[0]));
        m88376m2().f71620R.setText(C32343x.m95388F("text.hub.item.other", new Object[0]));
        m88376m2().f71621S.setText(C32343x.m95388F("text.hub.item.our.apps", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public final void m88278A3(C27587c cVar) {
        C32343x.m95499y0(this, "hub", "profile", "click");
        m88415z3(cVar.mo66944b(), cVar.mo66943a());
    }

    /* renamed from: B2 */
    private final void m88280B2() {
        m88382o2().mo62220Gw().mo48015bd();
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public final void m88281B3() {
        C32343x.m95499y0(this, "hub", "receive_remittance", "click");
        C38122f n2 = m88379n2();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f.C38123a.m112202C(n2, requireContext, (String) null, false, 6, (Object) null);
    }

    /* renamed from: C2 */
    private final void m88283C2() {
        C19767b sx = m88382o2().mo62258sx();
        sx.mo48027Kh().mo4819k(getViewLifecycleOwner(), new C28826f1(new C28868y(this)));
        LiveData fo = sx.mo48047fo();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(fo, viewLifecycleOwner, new C28837j0(this));
        LiveData mp = sx.mo48054mp();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(mp, viewLifecycleOwner2, new C28861u0(this));
        LiveData vm = sx.mo48063vm();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(vm, viewLifecycleOwner3, new C28871z0(this));
        LiveData Fq = sx.mo48025Fq();
        C1619q viewLifecycleOwner4 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner4, "viewLifecycleOwner");
        C37224b.m109963b(Fq, viewLifecycleOwner4, new C28811a1(this));
        sx.mo48062v().mo4819k(getViewLifecycleOwner(), new C28826f1(new C28814b1(this)));
        LiveData Lp = sx.mo48029Lp();
        C1619q viewLifecycleOwner5 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner5, "viewLifecycleOwner");
        C37224b.m109963b(Lp, viewLifecycleOwner5, new C28817c1(this));
        LiveData ru = sx.mo48059ru();
        C1619q viewLifecycleOwner6 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner6, "viewLifecycleOwner");
        C37224b.m109963b(ru, viewLifecycleOwner6, new C28820d1(this));
        LiveData pb = sx.mo48057pb();
        C1619q viewLifecycleOwner7 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner7, "viewLifecycleOwner");
        C37224b.m109963b(pb, viewLifecycleOwner7, new C28823e1(this));
        LiveData b6 = sx.mo48042b6();
        C1619q viewLifecycleOwner8 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner8, "viewLifecycleOwner");
        C37224b.m109963b(b6, viewLifecycleOwner8, new C28848o(this));
        LiveData nr = sx.mo48055nr();
        C1619q viewLifecycleOwner9 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner9, "viewLifecycleOwner");
        C37224b.m109963b(nr, viewLifecycleOwner9, new C28850p(this));
        LiveData T5 = sx.mo48034T5();
        C1619q viewLifecycleOwner10 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner10, "viewLifecycleOwner");
        C37224b.m109963b(T5, viewLifecycleOwner10, new C28852q(this));
        LiveData V6 = sx.mo48037V6();
        C1619q viewLifecycleOwner11 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner11, "viewLifecycleOwner");
        C37224b.m109963b(V6, viewLifecycleOwner11, new C28854r(this));
        LiveData qr = sx.mo48058qr();
        C1619q viewLifecycleOwner12 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner12, "viewLifecycleOwner");
        C37224b.m109963b(qr, viewLifecycleOwner12, new C28856s(this));
        LiveData su = sx.mo48060su();
        C1619q viewLifecycleOwner13 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner13, "viewLifecycleOwner");
        C37224b.m109963b(su, viewLifecycleOwner13, new C28858t(this));
        LiveData ct = sx.mo48043ct();
        C1619q viewLifecycleOwner14 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner14, "viewLifecycleOwner");
        C37224b.m109963b(ct, viewLifecycleOwner14, new C28860u(this));
        LiveData Qf = sx.mo48031Qf();
        C1619q viewLifecycleOwner15 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner15, "viewLifecycleOwner");
        C37224b.m109963b(Qf, viewLifecycleOwner15, new C28862v(this));
        LiveData df = sx.mo48044df();
        C1619q viewLifecycleOwner16 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner16, "viewLifecycleOwner");
        C37224b.m109963b(df, viewLifecycleOwner16, new C28864w(this));
        LiveData ka = sx.mo48052ka();
        C1619q viewLifecycleOwner17 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner17, "viewLifecycleOwner");
        C37224b.m109963b(ka, viewLifecycleOwner17, new C28866x(this));
        LiveData lt = sx.mo48053lt();
        C1619q viewLifecycleOwner18 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner18, "viewLifecycleOwner");
        C37224b.m109963b(lt, viewLifecycleOwner18, new C28870z(this));
        LiveData Cv = sx.mo48024Cv();
        C1619q viewLifecycleOwner19 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner19, "viewLifecycleOwner");
        C37224b.m109963b(Cv, viewLifecycleOwner19, new C28810a0(this));
        LiveData av = sx.mo48041av();
        C1619q viewLifecycleOwner20 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner20, "viewLifecycleOwner");
        C37224b.m109963b(av, viewLifecycleOwner20, new C28813b0(this));
        LiveData Be = sx.mo48022Be();
        C1619q viewLifecycleOwner21 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner21, "viewLifecycleOwner");
        C37224b.m109963b(Be, viewLifecycleOwner21, new C28816c0(this));
        LiveData vt = sx.mo48064vt();
        C1619q viewLifecycleOwner22 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner22, "viewLifecycleOwner");
        C37224b.m109963b(vt, viewLifecycleOwner22, new C28819d0(this));
        LiveData Qt = sx.mo48032Qt();
        C1619q viewLifecycleOwner23 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner23, "viewLifecycleOwner");
        C37224b.m109963b(Qt, viewLifecycleOwner23, new C28822e0(this));
        LiveData Ht = sx.mo48026Ht();
        C1619q viewLifecycleOwner24 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner24, "viewLifecycleOwner");
        C37224b.m109963b(Ht, viewLifecycleOwner24, new C28825f0(this));
        LiveData Vu = sx.mo48038Vu();
        C1619q viewLifecycleOwner25 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner25, "viewLifecycleOwner");
        C37224b.m109963b(Vu, viewLifecycleOwner25, new C28828g0(this));
        LiveData Bt = sx.mo48023Bt();
        C1619q viewLifecycleOwner26 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner26, "viewLifecycleOwner");
        C37224b.m109963b(Bt, viewLifecycleOwner26, new C28831h0(this));
        LiveData p0 = sx.mo48056p0();
        C1619q viewLifecycleOwner27 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner27, "viewLifecycleOwner");
        C37224b.m109963b(p0, viewLifecycleOwner27, new C28834i0(this));
        LiveData N1 = sx.mo48030N1();
        C1619q viewLifecycleOwner28 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner28, "viewLifecycleOwner");
        C37224b.m109963b(N1, viewLifecycleOwner28, new C28840k0(this));
        LiveData i1 = sx.mo48050i1();
        C1619q viewLifecycleOwner29 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner29, "viewLifecycleOwner");
        C37224b.m109963b(i1, viewLifecycleOwner29, new C28843l0(this));
        LiveData Z0 = sx.mo48039Z0();
        C1619q viewLifecycleOwner30 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner30, "viewLifecycleOwner");
        C37224b.m109963b(Z0, viewLifecycleOwner30, new C28845m0(this));
        LiveData U2 = sx.mo48035U2();
        C1619q viewLifecycleOwner31 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner31, "viewLifecycleOwner");
        C37224b.m109963b(U2, viewLifecycleOwner31, new C28847n0(this));
        LiveData V1 = sx.mo48036V1();
        C1619q viewLifecycleOwner32 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner32, "viewLifecycleOwner");
        C37224b.m109963b(V1, viewLifecycleOwner32, new C28849o0(this));
        LiveData k1 = sx.mo48051k1();
        C1619q viewLifecycleOwner33 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner33, "viewLifecycleOwner");
        C37224b.m109963b(k1, viewLifecycleOwner33, new C28851p0(this));
        LiveData Z1 = sx.mo48040Z1();
        C1619q viewLifecycleOwner34 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner34, "viewLifecycleOwner");
        C37224b.m109963b(Z1, viewLifecycleOwner34, new C28853q0(this));
        sx.getHasKycLiveData().mo4819k(getViewLifecycleOwner(), new C28826f1(new C28855r0(this)));
        sx.getUserInfoChangedLiveData().mo4819k(getViewLifecycleOwner(), new C28826f1(new C28857s0(this)));
        LiveData eb = sx.mo48046eb();
        C1619q viewLifecycleOwner35 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner35, "viewLifecycleOwner");
        C37224b.m109963b(eb, viewLifecycleOwner35, new C28859t0(this));
        LiveData ug = sx.mo48061ug();
        C1619q viewLifecycleOwner36 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner36, "viewLifecycleOwner");
        C37224b.m109963b(ug, viewLifecycleOwner36, new C28863v0(this));
        LiveData S2 = sx.mo48033S2();
        C1619q viewLifecycleOwner37 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner37, "viewLifecycleOwner");
        C37224b.m109963b(S2, viewLifecycleOwner37, new C28865w0(this));
        LiveData dg = sx.mo48045dg();
        C1619q viewLifecycleOwner38 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner38, "viewLifecycleOwner");
        C37224b.m109963b(dg, viewLifecycleOwner38, new C28867x0(this));
        LiveData Ln = sx.mo48028Ln();
        C1619q viewLifecycleOwner39 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner39, "viewLifecycleOwner");
        C37224b.m109963b(Ln, viewLifecycleOwner39, new C28869y0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public final void m88284C3() {
        C32343x.m95499y0(this, "hub", "settings", "click");
        m88320P2();
    }

    /* renamed from: D2 */
    private final void m88286D2(C20039b.C20040a aVar) {
        C28239b m2 = m88376m2();
        m2.f71626f.mo62207Q1(aVar.mo48443a());
        m2.f71643w.mo62207Q1(aVar.mo48447e());
        m2.f71640t.mo62207Q1(aVar.mo48444b());
        m2.f71641u.mo62207Q1(aVar.mo48445c());
        m2.f71642v.mo62207Q1(aVar.mo48446d());
        LayerView layerView = m2.f71644x;
        C41536l.m120488h(layerView, "layerBankGrouping");
        C32343x.m95458j0(layerView, !aVar.mo48449f());
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public final void m88287D3() {
        C32343x.m95499y0(this, "hub", "pension", "click");
        m88398t3();
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public final void m88289E2(C27551a aVar) {
        m88382o2().mo62220Gw().mo48019x3(aVar, "hub");
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public final void m88290E3() {
        C32343x.m95499y0(this, "hub", "sign_in_auth", "click");
        SecuritySettingsActivity.C22544a aVar = SecuritySettingsActivity.f59609G;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo55703a(requireContext, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public final void m88292F2(boolean z) {
        ProgressBar progressBar = m88376m2().f71630j;
        C41536l.m120488h(progressBar, "binding.circleLoading");
        C32343x.m95483r1(progressBar, z, false, 2, (Object) null);
    }

    /* renamed from: F3 */
    private final void m88293F3() {
        startActivity(new Intent(requireContext(), SmsNotifManagerActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public final void m88295G3() {
        C32343x.m95499y0(this, "hub", "sms_and_push_notifications", "click");
        m88293F3();
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public final void m88297H2() {
        C32343x.m95499y0(this, "hub", "logout", "log_out");
        C36728a authHelper = getAuthHelper();
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        authHelper.mo42368a(requireActivity);
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public final void m88298H3(Boolean bool) {
        C32343x.m95499y0(this, "hub", "become_solo", "click");
        m88323Q3(this, (PackageType) null, bool, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public final void m88300I2() {
        C32343x.m95499y0(this, "hub", "cancel_search", "click");
        m88382o2().mo62220Gw().mo48021zb();
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public final void m88301I3() {
        C32343x.m95499y0(this, "hub", "transactions", "click");
        C29108a.f74128N.mo68976a().mo4576A1(getChildFragmentManager(), "TRANSFERS_ACTION_SHEET");
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final void m88303J2() {
        C32343x.m95499y0(this, "hub", "search", "click");
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public final void m88304J3() {
        C32343x.m95499y0(this, "hub", "travel_card", "click");
        C38122f n2 = m88379n2();
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f.C38123a.m112203D(n2, requireActivity, (String) null, 2, (Object) null);
    }

    /* renamed from: K2 */
    private final void m88306K2(C40141a aVar) {
        if (aVar instanceof C27551a) {
            m88382o2().mo62220Gw().mo48019x3((C27551a) aVar, "hub_search");
        } else if (aVar instanceof C32041b) {
            m88382o2().mo62220Gw().mo48020z2((C32041b) aVar);
        } else if (aVar instanceof C27594e) {
            m88382o2().mo62220Gw().mo48014Ym();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public static final void m88307K3(C28808h hVar, ActivityResult activityResult) {
        C41536l.m120489i(hVar, "this$0");
        if (activityResult.mo371b() == 13) {
            m88323Q3(hVar, PackageType.Companion.getPackageTypeByBadge(hVar.mClient.getUserInfo().getPackageBadge()), (Boolean) null, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final void m88309L2(String str) {
        m88382o2().mo62220Gw().mo48018tk(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public static final void m88310L3(C28808h hVar, View view) {
        C38122f c;
        C41536l.m120489i(hVar, "this$0");
        Context context = hVar.getContext();
        if (context != null && (c = C38125h.m112238c(context)) != null) {
            Context requireContext = hVar.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            c.mo91626r(requireContext);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final void m88312M2(C27588d.C27591c cVar) {
        if (cVar instanceof C27588d.C27591c.C27593b) {
            m88306K2(((C27588d.C27591c.C27593b) cVar).mo66960b());
        } else if (cVar instanceof C27588d.C27591c.C27592a) {
            m88382o2().mo62220Gw().mo48017q4();
        }
    }

    /* renamed from: M3 */
    private final void m88313M3(String str) {
        PackageType packageTypeByBadge = PackageType.Companion.getPackageTypeByBadge(this.mClient.getUserInfo().getPackageBadge());
        String activePackageName = this.mClient.getUserInfo().getActivePackageName();
        ButtonListLargeView buttonListLargeView = m88376m2().f71623U;
        C41536l.m120488h(buttonListLargeView, "binding.userProfileInfo");
        C19262c.m64710b(buttonListLargeView, str);
        String clientUserName = getClientUserName();
        ButtonListLargeView buttonListLargeView2 = m88376m2().f71623U;
        if (packageTypeByBadge == null || activePackageName == null) {
            C41536l.m120488h(buttonListLargeView2, "setUpProfileHeader$lambda$7");
            m88347Y3(buttonListLargeView2, clientUserName);
        } else {
            C41536l.m120488h(buttonListLargeView2, "setUpProfileHeader$lambda$7");
            m88350Z3(buttonListLargeView2, activePackageName, packageTypeByBadge, clientUserName);
        }
        buttonListLargeView2.setOnClickListener(new C28803c(this));
        buttonListLargeView2.setOnButtonClickListener(new C28804d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public static final void m88315N3(C28808h hVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        hVar.m88382o2().mo62220Gw().mo48012Jl();
    }

    /* renamed from: O2 */
    private final void m88317O2(C20039b.C20041b bVar) {
        m88400u2();
        m88397t2(bVar.mo48452a());
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public static final void m88318O3(C28808h hVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        hVar.m88382o2().mo62220Gw().mo48012Jl();
    }

    /* renamed from: P2 */
    private final void m88320P2() {
        SettingsActivity.C34583a aVar = SettingsActivity.f83582N;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo84107a(requireContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public final void m88321P3(boolean z, String str) {
        LayerView layerView = m88376m2().f71612J;
        C41536l.m120488h(layerView, "binding.plusStatusLayer");
        C32343x.m95455i0(layerView);
        m88353a4(z, str);
    }

    /* renamed from: Q3 */
    static /* synthetic */ void m88323Q3(C28808h hVar, PackageType packageType, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            packageType = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        hVar.startCategoryPackagesActivity(packageType, bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final void m88325R2() {
        C32343x.m95499y0(this, "hub", "accounts_and_cards", "click");
        m88395s3();
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public final void m88326R3() {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        CoordinatorLayout c = m88376m2().mo3946b();
        C41536l.m120488h(c, "binding.root");
        C10145d.m37091e(requireContext, c);
        C1533o.m5445b(this, "REQUEST_KEY_OPEN_GIFT_CARD_TAB", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_GIFT_CARD_TAB_OPENED", Boolean.TRUE)));
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final void m88328S2() {
        C32343x.m95499y0(this, "hub", "addresses", "click");
        C38122f n2 = m88379n2();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f.C38123a.m112200A(n2, requireContext, false, false, false, false, false, 62, (Object) null);
    }

    /* renamed from: S3 */
    private final void m88329S3() {
        C28239b m2 = m88376m2();
        SearchItemsView searchItemsView = m2.f71616N;
        C41536l.m120488h(searchItemsView, "searchItemsView");
        C32343x.m95455i0(searchItemsView);
        AppCompatTextView appCompatTextView = m2.f71625e;
        C41536l.m120488h(appCompatTextView, "appVersion");
        C32343x.m95455i0(appCompatTextView);
        PageDescriptionView pageDescriptionView = m2.f71615M;
        C41536l.m120488h(pageDescriptionView, "searchBlank");
        C32343x.m95447f1(pageDescriptionView);
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final void m88331T2() {
        C32343x.m95499y0(this, "hub", "automatic_services", "click");
        DDSTOListActivity.m103489L2(requireContext());
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public final void m88332T3(C20038a aVar) {
        m88388q2(aVar.mo48439b());
        m88385p2(aVar.mo48438a());
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final void m88334U2() {
        C32343x.m95499y0(this, "hub", "banking_sets", "click");
        m88323Q3(this, (PackageType) null, (Boolean) null, 3, (Object) null);
    }

    /* renamed from: U3 */
    private final void m88335U3() {
        String str;
        ClientInfoWrapper userInfo;
        ClientStarInfo clientStarInfo;
        PlusStatusState.Companion companion = PlusStatusState.Companion;
        Client client = this.mClient;
        if (client == null || (userInfo = client.getUserInfo()) == null || (clientStarInfo = userInfo.getClientStarInfo()) == null) {
            str = null;
        } else {
            str = clientStarInfo.getCurrentLabelType();
        }
        PlusStatusState byStatus = companion.getByStatus(str);
        if (byStatus != null) {
            C28239b m2 = m88376m2();
            m2.f71612J.setBackgroundColor(C0767a.m2893c(requireContext(), byStatus.getColorRes()));
            m2.f71610H.setImageDrawable(C0767a.m2895e(requireContext(), byStatus.getIconRes()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final void m88337V2() {
        C32343x.m95499y0(this, "hub", "BILL_SPLIT", "click");
        C26360b bVar = C26360b.f66777a;
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        bVar.mo65554f(requireActivity);
    }

    /* renamed from: V3 */
    private final void m88338V3() {
        String str;
        ClientInfoWrapper userInfo;
        ClientStarInfo clientStarInfo;
        Client client = this.mClient;
        if (client == null || (userInfo = client.getUserInfo()) == null || (clientStarInfo = userInfo.getClientStarInfo()) == null || (str = clientStarInfo.getCurrentLabel()) == null) {
            str = "";
        }
        String F = C32343x.m95388F(UserInfoConsts.TEXT_PLUSPAGE_STATUS, new Object[0]);
        TwoLineReverseTextItem twoLineReverseTextItem = m88376m2().f71613K;
        twoLineReverseTextItem.setText(str + " " + F);
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m88340W2(String str) {
        C32343x.m95499y0(this, "hub", "bog_business_app", "click");
        C38122f n2 = m88379n2();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        n2.mo91562M(requireContext, str);
    }

    /* renamed from: W3 */
    private final void m88341W3() {
        int i;
        ClientInfoWrapper userInfo;
        ClientStarInfo clientStarInfo;
        Integer sumStatusPoint;
        Client client = this.mClient;
        if (client == null || (userInfo = client.getUserInfo()) == null || (clientStarInfo = userInfo.getClientStarInfo()) == null || (sumStatusPoint = clientStarInfo.getSumStatusPoint()) == null) {
            i = 0;
        } else {
            i = sumStatusPoint.intValue();
        }
        String F = C32343x.m95388F(UserInfoConsts.TEXT_PLUSPAGE_STARS, new Object[0]);
        m88376m2().f71613K.setTitle(i + " " + F);
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m88343X2(String str) {
        C32343x.m95499y0(this, "hub", "bog_pay_app", "click");
        C38122f n2 = m88379n2();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        n2.mo91562M(requireContext, str);
    }

    /* renamed from: X3 */
    private final void m88344X3(List list) {
        C28239b m2 = m88376m2();
        SearchItemsView searchItemsView = m2.f71616N;
        C41536l.m120488h(searchItemsView, "searchItemsView");
        C32343x.m95447f1(searchItemsView);
        PageDescriptionView pageDescriptionView = m2.f71615M;
        C41536l.m120488h(pageDescriptionView, "searchBlank");
        C32343x.m95455i0(pageDescriptionView);
        AppCompatTextView appCompatTextView = m2.f71625e;
        C41536l.m120488h(appCompatTextView, "appVersion");
        C32343x.m95455i0(appCompatTextView);
        m2.f71616N.mo62215R1(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final void m88346Y2(String str) {
        C32343x.m95499y0(this, "hub", "bog_scool_app", "click");
        C38122f n2 = m88379n2();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        n2.mo91562M(requireContext, str);
    }

    /* renamed from: Y3 */
    private final void m88347Y3(ButtonListLargeView buttonListLargeView, String str) {
        buttonListLargeView.setButtonListType(ButtonListLargeView.C13185c.THUMBNAIL_SECONDARY_TEXT);
        buttonListLargeView.setChangeButtonVisible(true);
        buttonListLargeView.setBottomViewType(ButtonListLargeView.C13183a.TEXT_VIEW);
        buttonListLargeView.setButtonText(buttonListLargeView.getResources().getString(C27031g.f67897d));
        buttonListLargeView.setLowerText(str);
        buttonListLargeView.setUpperText(buttonListLargeView.getResources().getString(C27031g.f67895b));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final void m88349Z2() {
        C32343x.m95499y0(this, "hub", "bnpl", "click");
        C38122f n2 = m88379n2();
        C24849e eVar = C24849e.BNPL_LIMIT;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        n2.mo91637w0(eVar, requireContext);
    }

    /* renamed from: Z3 */
    private final void m88350Z3(ButtonListLargeView buttonListLargeView, String str, PackageType packageType, String str2) {
        buttonListLargeView.setIconButtonVisible(true);
        buttonListLargeView.setBottomViewType(ButtonListLargeView.C13183a.TEXT_BADGE_VIEW);
        buttonListLargeView.getTextBadge().setBadgeText(str);
        TextBadgeView textBadge = buttonListLargeView.getTextBadge();
        int badgeTextColor = packageType.getBadgeTextColor();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        textBadge.setBadgeTextColor(C32343x.m95418U(badgeTextColor, requireContext));
        buttonListLargeView.getTextBadge().setBackgroundTint(packageType.getBadgeColor());
        buttonListLargeView.setIconButtonDrawable(C32343x.m95424X(C27028d.f67872h0, buttonListLargeView.getContext()));
        buttonListLargeView.setUpperText(str2);
        buttonListLargeView.setButtonListType(ButtonListLargeView.C13185c.THUMBNAIL);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final void m88352a3() {
        C32343x.m95499y0(this, "hub", "credit_card", "click");
        C38122f n2 = m88379n2();
        C24849e eVar = C24849e.CLIENT_LIMIT;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        n2.mo91637w0(eVar, requireContext);
    }

    /* renamed from: a4 */
    private final void m88353a4(boolean z, String str) {
        if (z) {
            LayerView layerView = m88376m2().f71612J;
            C41536l.m120488h(layerView, "binding.plusStatusLayer");
            C32343x.m95447f1(layerView);
            LayerView layerView2 = m88376m2().f71605C;
            C41536l.m120488h(layerView2, "binding.layerProfile");
            C32343x.m95447f1(layerView2);
            if (this.mClient.getUserInfo() != null) {
                m88313M3(str);
            }
            if (this.mClient.getUserInfo().isPlusStatusSegment()) {
                setUpPlusStatusSection();
                return;
            }
            LayerView layerView3 = m88376m2().f71612J;
            C41536l.m120488h(layerView3, "binding.plusStatusLayer");
            C32343x.m95455i0(layerView3);
            return;
        }
        LayerView layerView4 = m88376m2().f71605C;
        C41536l.m120488h(layerView4, "binding.layerProfile");
        C32343x.m95455i0(layerView4);
    }

    /* renamed from: b4 */
    private final void m88355b4(LayerView layerView, boolean z) {
        C32343x.m95483r1(layerView, z, false, 2, (Object) null);
    }

    private final String getClientUserName() {
        String name = this.mClient.getUserInfo().getClient().getName(this.mPreferencesApiManager.getLanguage());
        if (name == null) {
            return "";
        }
        if (this.mPreferencesApiManager.getLanguage() != C37353c.EN) {
            return name;
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C41358y.m120017g0(C40440x.m117181w0(lowerCase, new char[]{' '}, false, 0, 6, (Object) null), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C28812b.f73642d, 30, (Object) null);
    }

    private final C19788a getDarkModeActionSheet() {
        C19788a aVar;
        Fragment k0 = getChildFragmentManager().mo4418k0("FRAGMENT_TAG_DARK_MODE");
        if (k0 instanceof C19788a) {
            aVar = (C19788a) k0;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        return C38125h.m112239d(requireContext).mo91649a();
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public final void m88362h3() {
        C32343x.m95499y0(this, "hub", "dark_mode", "click");
        getDarkModeActionSheet().mo4576A1(getChildFragmentManager(), "FRAGMENT_TAG_DARK_MODE");
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public final void m88365i3() {
        C32343x.m95499y0(this, "hub", "debit_card", "click");
        C38122f n2 = m88379n2();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        n2.mo91597c0(requireContext);
    }

    private final void initLogout() {
        C28239b m2 = m88376m2();
        ConstraintLayout constraintLayout = m2.f71607E.f71673e;
        C41536l.m120488h(constraintLayout, "logoutContainer.buttonLogout");
        C32343x.m95483r1(constraintLayout, this.mClient.isAuthorized(), false, 2, (Object) null);
        View view = m2.f71629i;
        C41536l.m120488h(view, "bottomDivider");
        C32343x.m95483r1(view, this.mClient.isAuthorized(), false, 2, (Object) null);
        m2.f71607E.f71673e.setOnClickListener(new C28806f(this));
        m2.f71607E.f71676h.setText(C32343x.m95388F("text.hub.item.logout", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final void m88368j3() {
        C32343x.m95499y0(this, "hub", "deposit", "click");
        C38122f n2 = m88379n2();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f.C38123a.m112225u(n2, requireContext, (String) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public final void m88371k3() {
        C32343x.m95499y0(this, "hub", "exchange_rates", "click");
        ExchangeActivity.m103555a3(requireContext());
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public final void m88374l3() {
        C32343x.m95499y0(this, "hub", "financial_manager", "click");
        FinanceManagementActivity.C22161a aVar = FinanceManagementActivity.f58918L;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo54998a(requireContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final C28239b m88376m2() {
        C28239b bVar = this.f73636g;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public final void m88377m3() {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38281a a = C38125h.m112236a(requireContext);
        Context requireContext2 = requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        C38281a.C38282a.m112545a(a, requireContext2, (String) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final C38122f m88379n2() {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        return C38125h.m112238c(requireContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public final void m88380n3() {
        C32343x.m95499y0(this, "hub", "insurance", "click");
        C38122f n2 = m88379n2();
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f.C38123a.m112227w(n2, requireActivity, (String) null, 2, (Object) null);
    }

    /* renamed from: o2 */
    private final HubViewModel$ViewModel m88382o2() {
        return (HubViewModel$ViewModel) this.f73637h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public final void m88383o3() {
        C32343x.m95499y0(this, "hub", "interests", "click");
        C38122f n2 = m88379n2();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        n2.mo91596c(requireContext);
    }

    /* renamed from: p2 */
    private final void m88385p2(C20039b bVar) {
        if (bVar instanceof C20039b.C20040a) {
            m88286D2((C20039b.C20040a) bVar);
        } else if (bVar instanceof C20039b.C20041b) {
            m88317O2((C20039b.C20041b) bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public final void m88386p3() {
        C32343x.m95499y0(this, "hub", "investment_account_mngmt", "click");
        C38122f n2 = m88379n2();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        n2.mo91638x(requireContext);
    }

    /* renamed from: q2 */
    private final void m88388q2(boolean z) {
        C28239b m2 = m88376m2();
        SearchItemsView searchItemsView = m2.f71616N;
        C41536l.m120488h(searchItemsView, "searchItemsView");
        C32343x.m95455i0(searchItemsView);
        PageDescriptionView pageDescriptionView = m2.f71615M;
        C41536l.m120488h(pageDescriptionView, "searchBlank");
        C32343x.m95455i0(pageDescriptionView);
        LayerView layerView = m2.f71644x;
        C41536l.m120488h(layerView, "layerBankGrouping");
        m88355b4(layerView, z);
        LayerView layerView2 = m2.f71646z;
        C41536l.m120488h(layerView2, "layerNonBankingGrouping");
        m88355b4(layerView2, z);
        LayerView layerView3 = m2.f71603A;
        C41536l.m120488h(layerView3, "layerOtherProductGrouping");
        m88355b4(layerView3, z);
        LayerView layerView4 = m2.f71604B;
        C41536l.m120488h(layerView4, "layerOurAppsGrouping");
        m88355b4(layerView4, z);
        LayerView layerView5 = m2.f71606D;
        C41536l.m120488h(layerView5, "layerTransactionsGrouping");
        C32343x.m95447f1(layerView5);
        LayerView layerView6 = m2.f71628h;
        C41536l.m120488h(layerView6, "bottomContainer");
        C32343x.m95447f1(layerView6);
        AppCompatTextView appCompatTextView = m2.f71625e;
        C41536l.m120488h(appCompatTextView, "appVersion");
        C32343x.m95447f1(appCompatTextView);
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public final void m88389q3() {
        C32343x.m95499y0(this, "hub", "management", "click");
        C38122f n2 = m88379n2();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f.C38123a.m112226v(n2, requireContext, (String) null, (String) null, false, 14, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m88391r2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C28815c(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C28818d(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C28821e(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public final void m88392r3() {
        C32343x.m95499y0(this, "hub", "loyalty_programs", "click");
        LoyaltyListActivity.C21122a aVar = LoyaltyListActivity.f56693K;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        LoyaltyListActivity.C21122a.m68369b(aVar, requireContext, 0, (String) null, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public final void m88394s2(boolean z) {
        if (z) {
            C38122f n2 = m88379n2();
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            n2.mo91590a(requireContext);
            return;
        }
        C19305k.f53530L.mo47528a().mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: s3 */
    private final void m88395s3() {
        startActivity(new Intent(requireContext(), ManageAccountsAndCardsActivity.class));
    }

    private final void setUpPlusStatusSection() {
        m88338V3();
        m88341W3();
        m88335U3();
        m88376m2().f71612J.setOnClickListener(new C28807g(this));
    }

    private final void startCategoryPackagesActivity(PackageType packageType, Boolean bool) {
        C38122f n2 = m88379n2();
        boolean d = C41536l.m120484d(bool, Boolean.TRUE);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        n2.mo91616m(packageType, d, (String) null, requireContext, this.f73639j);
    }

    /* renamed from: t2 */
    private final void m88397t2(List list) {
        if (!list.isEmpty()) {
            m88344X3(list);
        } else {
            m88329S3();
        }
    }

    /* renamed from: t3 */
    private final void m88398t3() {
        startActivity(new Intent(requireContext(), ManagePensionFundsActivity.class));
    }

    /* renamed from: u2 */
    private final void m88400u2() {
        C28239b m2 = m88376m2();
        LayerView layerView = m2.f71644x;
        C41536l.m120488h(layerView, "layerBankGrouping");
        C32343x.m95455i0(layerView);
        LayerView layerView2 = m2.f71646z;
        C41536l.m120488h(layerView2, "layerNonBankingGrouping");
        C32343x.m95455i0(layerView2);
        LayerView layerView3 = m2.f71603A;
        C41536l.m120488h(layerView3, "layerOtherProductGrouping");
        C32343x.m95455i0(layerView3);
        LayerView layerView4 = m2.f71604B;
        C41536l.m120488h(layerView4, "layerOurAppsGrouping");
        C32343x.m95455i0(layerView4);
        LayerView layerView5 = m2.f71606D;
        C41536l.m120488h(layerView5, "layerTransactionsGrouping");
        C32343x.m95455i0(layerView5);
        LayerView layerView6 = m2.f71628h;
        C41536l.m120488h(layerView6, "bottomContainer");
        C32343x.m95455i0(layerView6);
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public final void m88401u3() {
        C32343x.m95499y0(this, "hub", "MONEY_REQUEST", "click");
        SelectBillSplitMoneyRequestActivity.C21792a aVar = SelectBillSplitMoneyRequestActivity.f58161J;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo54373a(requireContext);
    }

    /* renamed from: v2 */
    private final void m88403v2() {
        m88376m2().f71625e.setText(getString(C27031g.app_version_title, C34646b.m101751e(C34646b.m101748b("text.hub.bog.app.version", new Object[0]), getContext()), "6.3.9", "496"));
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public final void m88404v3() {
        C32343x.m95499y0(this, "hub", "offers_and_applications", "click");
        OffersAndApplicationsActivity.C21371b bVar = OffersAndApplicationsActivity.f57206M;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        OffersAndApplicationsActivity.C21371b.m69137b(bVar, requireContext, false, 2, (Object) null);
    }

    /* renamed from: w2 */
    private final void m88405w2() {
        C28239b m2 = m88376m2();
        m2.f71626f.mo62208S1(new C28824f(this));
        m2.f71640t.mo62208S1(new C28827g(this));
        m2.f71643w.mo62208S1(new C28830h(this));
        m2.f71641u.mo62208S1(new C28833i(this));
        m2.f71642v.mo62208S1(new C28836j(this));
        m2.f71639s.setOnTextChangeListener(new C28839k(this));
        m2.f71639s.setCancelButtonListener(new C28842l(this));
        m2.f71639s.setOnFocusChangeListener(new C28844m(this));
        m2.f71616N.mo62214Q1(new C28846n(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public final void m88406w3(String str) {
        C32343x.m95499y0(this, "hub", "payments", "click");
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f c = C38125h.m112238c(requireActivity);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f.C38123a.m112201B(c, requireContext, str, (String) null, false, 12, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m88408x2(C28808h hVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        hVar.m88382o2().mo62220Gw().mo48017q4();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public final void m88409x3() {
        C32343x.m95499y0(this, "hub", "piggy_bank", "click");
        C38122f n2 = m88379n2();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        n2.mo91642z(requireContext);
    }

    /* renamed from: y2 */
    private final void m88411y2() {
        m88376m2().f71617O.f71678e.setOnClickListener(new C28802b(this));
        m88376m2().f71617O.f71682i.setText(C32343x.m95388F("text.hub.item.setting", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public final void m88412y3() {
        C32343x.m95499y0(this, "hub", "privacy_policy", "click");
        C32303f.m95183C(requireContext());
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m88414z2(C28808h hVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        hVar.m88382o2().mo62220Gw().mo48014Ym();
    }

    /* renamed from: z3 */
    private final void m88415z3(PackageType packageType, String str) {
        if (packageType == null || str == null) {
            EditProfileActivity2.f59595H.mo55695b(this);
        } else {
            m88323Q3(this, packageType, (Boolean) null, 2, (Object) null);
        }
    }

    public final C36728a getAuthHelper() {
        C36728a aVar = this.f73638i;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("authHelper");
        return null;
    }

    public String getHeaderText() {
        return C32343x.m95388F("text.hub.item.name", new Object[0]);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f73636g = C28239b.m86779d(getLayoutInflater(), viewGroup, false);
        CoordinatorLayout c = m88376m2().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m88277A2();
        m88405w2();
        m88411y2();
        initLogout();
        m88280B2();
        m88403v2();
        m88283C2();
        m88382o2().mo62220Gw().mo48013W8();
        m88382o2().mo62220Gw().mo48016or();
    }
}
