package p461ig;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.chat.presentation.actionsheet.AccountSelectorComponentData;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import p341ge.bog.designsystem.components.common.Image;
import p376cg.C10431j;
import p668xg.C18761c;
import p668xg.C18762d;

/* renamed from: ig.e */
public final class C15634e extends RecyclerView.C1736h {

    /* renamed from: f */
    public static final C15635a f44440f = new C15635a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private List f44441d = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C15638g f44442e;

    /* renamed from: ig.e$a */
    public static final class C15635a {
        private C15635a() {
        }

        public /* synthetic */ C15635a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ig.e$b */
    public final class C15636b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C10431j f44443d;

        /* renamed from: e */
        final /* synthetic */ C15634e f44444e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15636b(C15634e eVar, C10431j jVar) {
            super(jVar.mo3946b());
            C41536l.m120489i(jVar, "binding");
            this.f44444e = eVar;
            this.f44443d = jVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m56450j(C15634e eVar, AccountSelectorItemView accountSelectorItemView, AccountSelectorComponentData accountSelectorComponentData, int i, C18761c cVar) {
            C41536l.m120489i(eVar, "this$0");
            C41536l.m120489i(accountSelectorItemView, "$this_apply");
            C41536l.m120489i(accountSelectorComponentData, "$selectorData");
            C41536l.m120489i(cVar, "<anonymous parameter 1>");
            C15638g f = eVar.f44442e;
            if (f != null) {
                f.mo42937a();
            }
            accountSelectorItemView.setActivated(true);
            eVar.m56442i(accountSelectorComponentData.mo34194g());
        }

        /* renamed from: i */
        public final void mo42947i(AccountSelectorComponentData accountSelectorComponentData) {
            Image.Url url;
            AccountSelectorComponentData accountSelectorComponentData2 = accountSelectorComponentData;
            C41536l.m120489i(accountSelectorComponentData2, "selectorData");
            AccountSelectorItemView accountSelectorItemView = this.f44443d.f29697e;
            C15634e eVar = this.f44444e;
            String j = accountSelectorComponentData.mo34198j();
            if (j == null) {
                j = accountSelectorComponentData.mo34195h();
            }
            String str = j;
            Currency instance = Currency.getInstance(accountSelectorComponentData.mo34193f());
            C41536l.m120488h(instance, "getInstance(selectorData.currency)");
            C18762d dVar = new C18762d(instance, accountSelectorComponentData.mo34189d(), false, 4, (DefaultConstructorMarker) null);
            Currency instance2 = Currency.getInstance(accountSelectorComponentData.mo34193f());
            C41536l.m120488h(instance2, "getInstance(selectorData.currency)");
            List e = C41339p.m119900e(new C18762d(instance2, accountSelectorComponentData.mo34189d(), false, 4, (DefaultConstructorMarker) null));
            String e2 = accountSelectorComponentData.mo34191e();
            if (e2 != null) {
                url = new Image.Url(e2, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
            } else {
                url = null;
            }
            accountSelectorItemView.setData(new AccountSelectorItemView.C13140a(str, dVar, e, false, (Image) null, url, accountSelectorComponentData.mo34199k(), 24, (DefaultConstructorMarker) null));
            accountSelectorItemView.setOnCurrencyItemSelectedListener(new C15637f(eVar, accountSelectorItemView, accountSelectorComponentData2));
        }

        /* renamed from: k */
        public final void mo42948k(boolean z) {
            this.f44443d.f29697e.setActivated(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m56442i(int i) {
        ArrayList<Number> arrayList = new ArrayList<>();
        List list = this.f44441d;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list, 10));
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C41341q.m119917t();
            }
            AccountSelectorComponentData accountSelectorComponentData = (AccountSelectorComponentData) next;
            if (accountSelectorComponentData.mo34194g() == i) {
                arrayList.add(Integer.valueOf(i2));
                accountSelectorComponentData = AccountSelectorComponentData.m49045b(accountSelectorComponentData, 0, (String) null, (String) null, (String) null, (BigDecimal) null, (String) null, (Boolean) null, true, C11051p3.f31760d, (Object) null);
            } else if (accountSelectorComponentData.mo34197i()) {
                arrayList.add(Integer.valueOf(i2));
                accountSelectorComponentData = AccountSelectorComponentData.m49045b(accountSelectorComponentData, 0, (String) null, (String) null, (String) null, (BigDecimal) null, (String) null, (Boolean) null, false, C11051p3.f31760d, (Object) null);
            }
            arrayList2.add(accountSelectorComponentData);
            i2 = i3;
        }
        this.f44441d = arrayList2;
        for (Number intValue : arrayList) {
            notifyItemChanged(intValue.intValue(), "payload");
        }
    }

    public int getItemCount() {
        return this.f44441d.size();
    }

    /* renamed from: h */
    public final List mo42941h() {
        return this.f44441d;
    }

    /* renamed from: j */
    public void onBindViewHolder(C15636b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        bVar.mo42947i((AccountSelectorComponentData) this.f44441d.get(i));
    }

    /* renamed from: k */
    public void onBindViewHolder(C15636b bVar, int i, List list) {
        C41536l.m120489i(bVar, "holder");
        C41536l.m120489i(list, "payloads");
        if (list.isEmpty()) {
            super.onBindViewHolder(bVar, i, list);
        } else {
            bVar.mo42948k(((AccountSelectorComponentData) this.f44441d.get(i)).mo34197i());
        }
    }

    /* renamed from: l */
    public C15636b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C10431j d = C10431j.m37889d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C15636b(this, d);
    }

    /* renamed from: m */
    public final void mo42945m(C15638g gVar) {
        C41536l.m120489i(gVar, "canChooseItemListener");
        this.f44442e = gVar;
    }

    /* renamed from: n */
    public final void mo42946n(List list) {
        C41536l.m120489i(list, "<set-?>");
        this.f44441d = list;
    }
}
