package p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import g91.C32343x;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p481jm.C16230i;
import p607sm.C17875p;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantCardStatusActivity */
public final class InstantCardStatusActivity extends C14182b {

    /* renamed from: H */
    public static final C14129a f41528H = new C14129a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f41529G = C41219i.m119470b(new C14130b(this));

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantCardStatusActivity$a */
    public static final class C14129a {
        private C14129a() {
        }

        public /* synthetic */ C14129a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo39211a(Context context, String str) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, "countryName");
            Intent intent = new Intent(context, InstantCardStatusActivity.class);
            intent.putExtra("ARG_COUNTRY_NAME", str);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.InstantCardStatusActivity$b */
    static final class C14130b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ InstantCardStatusActivity f41530d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14130b(InstantCardStatusActivity instantCardStatusActivity) {
            super(0);
            this.f41530d = instantCardStatusActivity;
        }

        /* renamed from: b */
        public final C16230i invoke() {
            return C16230i.m57850d(this.f41530d.getLayoutInflater());
        }
    }

    /* renamed from: F2 */
    private final void m52342F2() {
        m52344H2().f45863e.setOnClickListener(new C17875p(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public static final void m52343G2(InstantCardStatusActivity instantCardStatusActivity, View view) {
        C41536l.m120489i(instantCardStatusActivity, "this$0");
        instantCardStatusActivity.finish();
    }

    /* renamed from: H2 */
    private final C16230i m52344H2() {
        return (C16230i) this.f41529G.getValue();
    }

    /* renamed from: I2 */
    private final void m52345I2() {
        String str;
        C16230i H2 = m52344H2();
        H2.f45867i.setTitleText(C32343x.m95388F("text.order.iic.card.success.message", new Object[0]));
        H2.f45868j.setText(C32343x.m95388F("text.order.iic.card.success.page.desc", new Object[0]));
        H2.f45863e.setButtonText(C32343x.m95388F("text.order.iic.card.success.go.to.main.page", new Object[0]));
        H2.f45866h.setTitle(C32343x.m95388F("text.order.iic.card.success.page.card.details", new Object[0]));
        H2.f45864f.setTitle(C32343x.m95388F("text.order.iic.card.success.page.card", new Object[0]));
        H2.f45864f.setText(C32343x.m95388F("text.order.iic.card.success.page.card.desc", new Object[0]));
        H2.f45865g.setTitle(C32343x.m95388F("text.order.iic.card.success.page.country", new Object[0]));
        TwoLineTextItem twoLineTextItem = H2.f45865g;
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("ARG_COUNTRY_NAME");
        } else {
            str = null;
        }
        twoLineTextItem.setText(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m52344H2().mo3946b());
        super.mo37451O1(bundle);
        m52345I2();
        m52342F2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.order.iic.card.title", new Object[0]);
    }
}
