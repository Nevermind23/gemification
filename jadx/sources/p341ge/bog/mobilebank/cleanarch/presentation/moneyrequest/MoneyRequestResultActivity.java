package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.core.content.C0767a;
import he1.C41217g;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10464h;
import p90.C27416s0;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.MoneyRequestResultActivity */
public final class MoneyRequestResultActivity extends C30772sa {

    /* renamed from: H */
    public static final C21779a f58136H = new C21779a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f58137F = C41219i.m119470b(new C21780b(this));

    /* renamed from: G */
    private final C41217g f58138G = C41219i.m119470b(new C21781c(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.MoneyRequestResultActivity$a */
    public static final class C21779a {
        private C21779a() {
        }

        public /* synthetic */ C21779a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m70572b(C21779a aVar, Context context, MoneyRequestSuccessItem moneyRequestSuccessItem, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            aVar.mo54343a(context, moneyRequestSuccessItem, z);
        }

        /* renamed from: a */
        public final void mo54343a(Context context, MoneyRequestSuccessItem moneyRequestSuccessItem, boolean z) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(moneyRequestSuccessItem, "data");
            Intent intent = new Intent(context, MoneyRequestResultActivity.class);
            intent.putExtra("DATA", moneyRequestSuccessItem);
            intent.putExtra("FROM_BILL_SPLIT", z);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.MoneyRequestResultActivity$b */
    static final class C21780b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestResultActivity f58139d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21780b(MoneyRequestResultActivity moneyRequestResultActivity) {
            super(0);
            this.f58139d = moneyRequestResultActivity;
        }

        /* renamed from: b */
        public final C27416s0 invoke() {
            C27416s0 a = C27416s0.m84969a(this.f58139d.findViewById(C10322k.result_page));
            C41536l.m120488h(a, "bind(findViewById(R.id.result_page))");
            return a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.MoneyRequestResultActivity$c */
    static final class C21781c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestResultActivity f58140d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21781c(MoneyRequestResultActivity moneyRequestResultActivity) {
            super(0);
            this.f58140d = moneyRequestResultActivity;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f58140d.getIntent().getBooleanExtra("FROM_BILL_SPLIT", false));
        }
    }

    /* renamed from: E2 */
    private final C27416s0 m70566E2() {
        return (C27416s0) this.f58137F.getValue();
    }

    /* renamed from: F2 */
    private final boolean m70567F2() {
        return ((Boolean) this.f58138G.getValue()).booleanValue();
    }

    /* renamed from: G2 */
    private final void m70568G2(String str) {
        C36546y.m108282F().mo27152s("money_request", "", str);
        C36546y.m108282F().mo27137H("money_request", str, "", (Bundle) null, C10464h.C10465a.FACEBOOK);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_money_request_result;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        String str;
        super.mo37451O1(bundle);
        MoneyRequestSuccessItem moneyRequestSuccessItem = (MoneyRequestSuccessItem) getIntent().getParcelableExtra("DATA");
        if (moneyRequestSuccessItem != null) {
            boolean z = true;
            if (moneyRequestSuccessItem.mo54352f()) {
                if (m70567F2()) {
                    m70566E2().f69732n.setText(C10328q.bill_split_total_money_amount);
                } else if (Integer.parseInt(moneyRequestSuccessItem.mo54350e()) > 1) {
                    m70566E2().f69732n.setText(C10328q.money_request_total_requested_money_header);
                } else {
                    m70566E2().f69732n.setText(C10328q.money_request_money_header);
                }
                m70566E2().f69724f.setImageResource(C10320i.ic_result_success);
                m70566E2().f69730l.setText(moneyRequestSuccessItem.mo54348d());
                m70566E2().f69728j.setText(moneyRequestSuccessItem.mo54350e());
                TextView textView = m70566E2().f69727i;
                AccountLov b = moneyRequestSuccessItem.mo54347b();
                if (b != null) {
                    str = b.getAcctNo();
                } else {
                    str = null;
                }
                textView.setText(str);
                m70566E2().f69729k.setText(moneyRequestSuccessItem.mo54346a());
                m70566E2().f69725g.setText(getString(C10328q.money_request_success_header));
                m70566E2().f69725g.setTextColor(C0767a.m2893c(this, C10318g.success_screen_positive_title_color));
            } else {
                m70566E2().f69724f.setImageResource(C10320i.ic_result_denied);
                m70566E2().f69725g.setTextColor(C0767a.m2893c(this, C10318g.success_screen_negative_title_color));
            }
            if (moneyRequestSuccessItem.mo54346a().length() != 0) {
                z = false;
            }
            if (z) {
                m70566E2().f69723e.setVisibility(8);
                m70566E2().f69729k.setVisibility(8);
                return;
            }
            m70566E2().f69723e.setVisibility(0);
            m70566E2().f69729k.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        String str;
        super.onResume();
        if (!m70567F2()) {
            str = "money_request_type_request_success_page";
        } else {
            str = "money_request_type_split_success_page";
        }
        m70568G2(str);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.money_request_search_header);
        C41536l.m120488h(string, "getString(R.string.money_request_search_header)");
        return string;
    }
}
