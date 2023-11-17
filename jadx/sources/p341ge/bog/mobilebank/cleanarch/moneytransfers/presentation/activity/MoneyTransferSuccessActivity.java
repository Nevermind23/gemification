package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import g91.C32343x;
import iu0.C36546y;
import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import p380ck.C10464h;
import p90.C27443v0;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferSuccessActivity */
public final class MoneyTransferSuccessActivity extends C30772sa {

    /* renamed from: H */
    public static final C21207a f56942H = new C21207a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C27443v0 f56943F;

    /* renamed from: G */
    private C21208b f56944G;

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferSuccessActivity$a */
    public static final class C21207a {
        private C21207a() {
        }

        public /* synthetic */ C21207a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo53111a(Context context, C21208b bVar) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(bVar, "data");
            Intent intent = new Intent(context, MoneyTransferSuccessActivity.class);
            intent.putExtra("INTENT_EXTRA_DATA", bVar);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferSuccessActivity$b */
    public static final class C21208b implements Serializable {

        /* renamed from: d */
        private final String f56945d;

        /* renamed from: e */
        private final String f56946e;

        /* renamed from: f */
        private final String f56947f;

        /* renamed from: g */
        private final String f56948g;

        /* renamed from: h */
        private final String f56949h;

        /* renamed from: i */
        private final String f56950i;

        /* renamed from: j */
        private final String f56951j;

        /* renamed from: k */
        private final String f56952k;

        public C21208b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            C41536l.m120489i(str, "mtSystem");
            C41536l.m120489i(str2, "transferNumber");
            C41536l.m120489i(str3, "selectedSender");
            C41536l.m120489i(str4, "selectedAccountNumber");
            C41536l.m120489i(str5, "transferAmount");
            C41536l.m120489i(str6, "senderCountry");
            this.f56945d = str;
            this.f56946e = str2;
            this.f56947f = str3;
            this.f56948g = str4;
            this.f56949h = str5;
            this.f56950i = str6;
            this.f56951j = str7;
            this.f56952k = str8;
        }

        /* renamed from: a */
        public final String mo53112a() {
            return this.f56952k;
        }

        /* renamed from: b */
        public final String mo53113b() {
            return this.f56945d;
        }

        /* renamed from: c */
        public final String mo53114c() {
            return this.f56951j;
        }

        /* renamed from: d */
        public final String mo53115d() {
            return this.f56948g;
        }

        /* renamed from: e */
        public final String mo53116e() {
            return this.f56947f;
        }

        /* renamed from: f */
        public final String mo53117f() {
            return this.f56950i;
        }

        /* renamed from: g */
        public final String mo53118g() {
            return this.f56949h;
        }

        /* renamed from: h */
        public final String mo53119h() {
            return this.f56946e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_money_transfer_success;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C21208b bVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        super.mo37451O1(bundle);
        C27443v0 a = C27443v0.m85079a(findViewById(C10322k.f28887r9));
        C41536l.m120488h(a, "bind(findViewById(R.id.content_layout))");
        this.f56943F = a;
        Serializable serializableExtra = getIntent().getSerializableExtra("INTENT_EXTRA_DATA");
        String str10 = null;
        if (serializableExtra instanceof C21208b) {
            bVar = (C21208b) serializableExtra;
        } else {
            bVar = null;
        }
        this.f56944G = bVar;
        C27443v0 v0Var = this.f56943F;
        if (v0Var == null) {
            C41536l.m120506z("binding");
            v0Var = null;
        }
        BogTextView bogTextView = v0Var.f70046m;
        C21208b bVar2 = this.f56944G;
        if (bVar2 != null) {
            str = bVar2.mo53116e();
        } else {
            str = null;
        }
        bogTextView.setText(str);
        C27443v0 v0Var2 = this.f56943F;
        if (v0Var2 == null) {
            C41536l.m120506z("binding");
            v0Var2 = null;
        }
        BogTextView bogTextView2 = v0Var2.f70044k;
        C21208b bVar3 = this.f56944G;
        if (bVar3 != null) {
            str2 = bVar3.mo53115d();
        } else {
            str2 = null;
        }
        bogTextView2.setText(str2);
        C27443v0 v0Var3 = this.f56943F;
        if (v0Var3 == null) {
            C41536l.m120506z("binding");
            v0Var3 = null;
        }
        BogTextView bogTextView3 = v0Var3.f70049p;
        C21208b bVar4 = this.f56944G;
        if (bVar4 != null) {
            str3 = bVar4.mo53119h();
        } else {
            str3 = null;
        }
        bogTextView3.setText(str3);
        C27443v0 v0Var4 = this.f56943F;
        if (v0Var4 == null) {
            C41536l.m120506z("binding");
            v0Var4 = null;
        }
        BogTextView bogTextView4 = v0Var4.f70048o;
        C21208b bVar5 = this.f56944G;
        if (bVar5 != null) {
            str4 = bVar5.mo53118g();
        } else {
            str4 = null;
        }
        bogTextView4.setText(str4);
        C27443v0 v0Var5 = this.f56943F;
        if (v0Var5 == null) {
            C41536l.m120506z("binding");
            v0Var5 = null;
        }
        BogTextView bogTextView5 = v0Var5.f70045l;
        C21208b bVar6 = this.f56944G;
        if (bVar6 != null) {
            str5 = bVar6.mo53117f();
        } else {
            str5 = null;
        }
        bogTextView5.setText(str5);
        C21208b bVar7 = this.f56944G;
        if (bVar7 != null) {
            str6 = bVar7.mo53112a();
        } else {
            str6 = null;
        }
        if (str6 == null) {
            C27443v0 v0Var6 = this.f56943F;
            if (v0Var6 == null) {
                C41536l.m120506z("binding");
                v0Var6 = null;
            }
            BogTextView bogTextView6 = v0Var6.f70038e;
            C41536l.m120488h(bogTextView6, "binding.amountTitleTxt");
            C32343x.m95401L0(bogTextView6);
            C27443v0 v0Var7 = this.f56943F;
            if (v0Var7 == null) {
                C41536l.m120506z("binding");
                v0Var7 = null;
            }
            BogTextView bogTextView7 = v0Var7.f70039f;
            C41536l.m120488h(bogTextView7, "binding.amountTxt");
            C32343x.m95401L0(bogTextView7);
            C27443v0 v0Var8 = this.f56943F;
            if (v0Var8 == null) {
                C41536l.m120506z("binding");
                v0Var8 = null;
            }
            View view = v0Var8.f70043j;
            C41536l.m120488h(view, "binding.secondSeparator");
            C32343x.m95401L0(view);
        } else {
            C27443v0 v0Var9 = this.f56943F;
            if (v0Var9 == null) {
                C41536l.m120506z("binding");
                v0Var9 = null;
            }
            BogTextView bogTextView8 = v0Var9.f70039f;
            C21208b bVar8 = this.f56944G;
            if (bVar8 != null) {
                str9 = bVar8.mo53112a();
            } else {
                str9 = null;
            }
            bogTextView8.setText(str9);
        }
        C21208b bVar9 = this.f56944G;
        if (bVar9 != null) {
            str7 = bVar9.mo53114c();
        } else {
            str7 = null;
        }
        if (str7 == null) {
            C27443v0 v0Var10 = this.f56943F;
            if (v0Var10 == null) {
                C41536l.m120506z("binding");
                v0Var10 = null;
            }
            BogTextView bogTextView9 = v0Var10.f70041h;
            C41536l.m120488h(bogTextView9, "binding.rateTitleTxt");
            C32343x.m95401L0(bogTextView9);
            C27443v0 v0Var11 = this.f56943F;
            if (v0Var11 == null) {
                C41536l.m120506z("binding");
                v0Var11 = null;
            }
            BogTextView bogTextView10 = v0Var11.f70042i;
            C41536l.m120488h(bogTextView10, "binding.rateTxt");
            C32343x.m95401L0(bogTextView10);
        } else {
            C27443v0 v0Var12 = this.f56943F;
            if (v0Var12 == null) {
                C41536l.m120506z("binding");
                v0Var12 = null;
            }
            BogTextView bogTextView11 = v0Var12.f70042i;
            C21208b bVar10 = this.f56944G;
            if (bVar10 != null) {
                str8 = bVar10.mo53114c();
            } else {
                str8 = null;
            }
            bogTextView11.setText(str8);
        }
        C10463g F = C36546y.m108282F();
        C21208b bVar11 = this.f56944G;
        if (bVar11 != null) {
            str10 = bVar11.mo53113b();
        }
        F.mo27137H("remittance", "remittance_success_page", str10, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.money_transfers_header_text);
        C41536l.m120488h(string, "getString(R.string.money_transfers_header_text)");
        return string;
    }
}
