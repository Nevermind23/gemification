package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import g91.C32289b0;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p451hk.C15529g;
import p493kk.C16447a;
import p645vk.C18400a;
import p645vk.C18401b;
import p725cr.C19788a;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.a */
public final class C13657a extends C19788a {

    /* renamed from: L */
    public static final C13658a f40802L = new C13658a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C16447a f40803H;

    /* renamed from: I */
    private final C41217g f40804I = C41219i.m119470b(new C13661d(this));

    /* renamed from: J */
    private final C41217g f40805J = C41219i.m119470b(new C13659b(this));

    /* renamed from: K */
    private final C41217g f40806K = C41219i.m119470b(new C13660c(this));

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.a$a */
    public static final class C13658a {
        private C13658a() {
        }

        public /* synthetic */ C13658a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13657a mo37547a(String str, String str2, String str3) {
            C41536l.m120489i(str, "providerTitle");
            C41536l.m120489i(str2, "providerPhone");
            C41536l.m120489i(str3, "providerImageUrl");
            C13657a aVar = new C13657a();
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_PROVIDER_TITLE", str), C41233s.m119492a("ARG_PROVIDER_PHONE", str2), C41233s.m119492a("ARG_PROVIDER_IMAGE_URL", str3)));
            return aVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.a$b */
    static final class C13659b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C13657a f40807d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13659b(C13657a aVar) {
            super(0);
            this.f40807d = aVar;
        }

        public final String invoke() {
            Bundle arguments = this.f40807d.getArguments();
            return C32343x.m95388F(arguments != null ? arguments.getString("ARG_PROVIDER_IMAGE_URL") : null, new Object[0]);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.a$c */
    static final class C13660c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C13657a f40808d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13660c(C13657a aVar) {
            super(0);
            this.f40808d = aVar;
        }

        public final String invoke() {
            Bundle arguments = this.f40808d.getArguments();
            return C32343x.m95388F(arguments != null ? arguments.getString("ARG_PROVIDER_PHONE") : null, new Object[0]);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.a$d */
    static final class C13661d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C13657a f40809d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13661d(C13657a aVar) {
            super(0);
            this.f40809d = aVar;
        }

        public final String invoke() {
            Bundle arguments = this.f40809d.getArguments();
            return C32343x.m95388F(arguments != null ? arguments.getString("ARG_PROVIDER_TITLE") : null, new Object[0]);
        }
    }

    /* renamed from: g2 */
    private final void m51133g2(String str) {
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)));
    }

    /* renamed from: h2 */
    private final C16447a m51134h2() {
        C16447a aVar = this.f40803H;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: i2 */
    private final String m51135i2() {
        return (String) this.f40805J.getValue();
    }

    /* renamed from: j2 */
    private final String m51136j2() {
        return (String) this.f40806K.getValue();
    }

    /* renamed from: k2 */
    private final String m51137k2() {
        return (String) this.f40804I.getValue();
    }

    /* renamed from: l2 */
    private final void m51138l2() {
        m51134h2().f46455k.setText(m51137k2());
        C32289b0.m95103o(m51134h2().f46454j, C32289b0.m95091c(m51135i2()));
        m51134h2().f46451g.setBadge(new NotificationBadgeView.BadgeType.Number(1));
        m51134h2().f46456l.setBadge(new NotificationBadgeView.BadgeType.Number(2));
        m51134h2().f46458n.setBadge(new NotificationBadgeView.BadgeType.Number(3));
        m51134h2().f46452h.setText(C32343x.m95388F("rbc.ins.policy.details.accident.desc1", new Object[0]));
        m51134h2().f46457m.setText(C32343x.m95388F("rbc.ins.policy.details.accident.desc2", new Object[0]));
        m51134h2().f46459o.setText(C32343x.m95388F("rbc.ins.policy.details.accident.desc3", new Object[0]));
        m51134h2().f46449e.setOnClickListener(new C18400a(this));
        m51134h2().f46450f.setOnClickListener(new C18401b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m51139m2(C13657a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        aVar.m51133g2("112");
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m51140n2(C13657a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        aVar.m51133g2(aVar.m51136j2());
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f40803H = C16447a.m58592d(getLayoutInflater(), viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f40803H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        mo26370a2(getString(C15529g.accident_action_sheet_title));
        super.onViewCreated(view, bundle);
        m51138l2();
    }
}
