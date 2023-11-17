package p341ge.bog.mobilebank.qrwithdrawal.presentation.resultpage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import e01.C31637a;
import e01.C31640d;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import i01.C36334b;
import i01.C36337e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37613p;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.QrResult;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p380ck.C10464h;
import t01.C38618a;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.QrResultPageActivity */
public final class QrResultPageActivity extends C34435a {

    /* renamed from: H */
    public static final C34433a f83450H = new C34433a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f83451G = C41219i.m119470b(new C34434b(this));

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.QrResultPageActivity$a */
    public static final class C34433a {
        private C34433a() {
        }

        public /* synthetic */ C34433a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo83037a(QrResult qrResult, Context context) {
            C41536l.m120489i(qrResult, "data");
            C41536l.m120489i(context, "context");
            context.startActivity(C37613p.m110614a(new Intent(context, QrResultPageActivity.class), C41233s.m119492a("EXTRA_RESULT_DATA", qrResult)));
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.QrResultPageActivity$b */
    static final class C34434b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ QrResultPageActivity f83452d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34434b(QrResultPageActivity qrResultPageActivity) {
            super(0);
            this.f83452d = qrResultPageActivity;
        }

        /* renamed from: b */
        public final C36334b invoke() {
            return C36334b.m107826d(this.f83452d.getLayoutInflater());
        }
    }

    /* renamed from: F2 */
    private final C36334b m101265F2() {
        return (C36334b) this.f83451G.getValue();
    }

    /* renamed from: G2 */
    private final void m101266G2() {
        Intent flags = new Intent(this, MainActivity.class).setFlags(872415232);
        C41536l.m120488h(flags, "Intent(this, MainActivit…_SINGLE_TOP\n            )");
        startActivity(flags);
        finish();
    }

    /* renamed from: H2 */
    private final void m101267H2(List list, boolean z) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Details details = (Details) it.next();
                C36337e d = C36337e.m107840d(LayoutInflater.from(this), m101265F2().f87672f, true);
                d.f87700f.setText(details.mo83005a());
                int i = 0;
                d.f87700f.setTitle(C32343x.m95388F(details.mo83006b(), new Object[0]));
                if (!z) {
                    View view = d.f87699e;
                    C41536l.m120488h(view, "divider");
                    if (!(!C41536l.m120484d(C41358y.m120019i0(list), details))) {
                        i = 8;
                    }
                    view.setVisibility(i);
                }
            }
        }
    }

    /* renamed from: I2 */
    private final void m101268I2() {
        QrResult qrResult;
        m101265F2().f87671e.setButtonText(C32343x.m95388F("qr.atm.withdrawal.result.button.home.page", new Object[0]));
        m101265F2().f87674h.setTitle(C32343x.m95388F("qr.atm.withdrawal.result.details.block.header", new Object[0]));
        m101265F2().f87671e.setOnClickListener(new C38618a(this));
        Intent intent = getIntent();
        if (intent != null) {
            qrResult = (QrResult) intent.getParcelableExtra("EXTRA_RESULT_DATA");
        } else {
            qrResult = null;
        }
        C41536l.m120486f(qrResult);
        if (qrResult instanceof QrResult.Success) {
            LayerView layerView = m101265F2().f87673g;
            C41536l.m120488h(layerView, "binding.detailsContainer");
            C32343x.m95447f1(layerView);
            PageDescriptionView pageDescriptionView = m101265F2().f87676j;
            pageDescriptionView.setDrawableType(PageDescriptionView.C13421b.IMAGE);
            pageDescriptionView.setImage(new Image.Animation.Raw(C31640d.anim_qr_withdrawal, (Image.Animation.AnimationConfig) null, 2, (DefaultConstructorMarker) null));
            pageDescriptionView.setTitle(C32343x.m95388F("qr.atm.withdrawal.result.main.text", new Object[0]));
            pageDescriptionView.setText(C32343x.m95388F("qr.atm.withdrawal.result.info.text", new Object[0]));
            QrResult.Success success = (QrResult.Success) qrResult;
            m101267H2(success.mo83026a(), success.mo83027b());
            InlineFeedback2 inlineFeedback2 = m101265F2().f87675i;
            C41536l.m120488h(inlineFeedback2, "binding.feedback");
            C32343x.m95483r1(inlineFeedback2, success.mo83027b(), false, 2, (Object) null);
            m101265F2().f87675i.setTitle(C32343x.m95388F("qr.atm.withdrawal.page.credit.card.selected.commission", new Object[0]));
            C32343x.m95393H0(this, "qr_withdrawal_page", (String) null, "qr_atm_withdrawal_result", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        } else if (qrResult instanceof QrResult.Error) {
            PageDescriptionView pageDescriptionView2 = m101265F2().f87676j;
            pageDescriptionView2.setDrawableType(PageDescriptionView.C13421b.IMAGE);
            pageDescriptionView2.setImage(new Image.Resource(C31637a.out_of_order_error, (Boolean) null, 2, (DefaultConstructorMarker) null));
            pageDescriptionView2.setTitle(C32343x.m95388F("qr.atm.withdrawal.result.error.main.text", new Object[0]));
            QrResult.Error error = (QrResult.Error) qrResult;
            pageDescriptionView2.setText(C34646b.m101752f(error.mo83016a(), (Context) null, 1, (Object) null));
            C32343x.m95393H0(this, "qr_withdrawal_page", C34646b.m101752f(error.mo83016a(), (Context) null, 1, (Object) null), "error_page_loaded", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m101269J2(QrResultPageActivity qrResultPageActivity, View view) {
        C41536l.m120489i(qrResultPageActivity, "this$0");
        qrResultPageActivity.m101266G2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m101265F2().mo3946b());
        super.mo37451O1(bundle);
        m101268I2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("qr.atm.withdrawal.page.main.header", new Object[0]);
    }
}
