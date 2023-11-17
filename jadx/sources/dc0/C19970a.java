package dc0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakDetailItem;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p615tg.C17963d;
import xb0.C29729q;

/* renamed from: dc0.a */
public final class C19970a extends C1819o {

    /* renamed from: dc0.a$a */
    public static final class C19971a extends RecyclerView.C1734f0 {

        /* renamed from: e */
        public static final C19972a f54565e = new C19972a((DefaultConstructorMarker) null);

        /* renamed from: d */
        private final C29729q f54566d;

        /* renamed from: dc0.a$a$a */
        public static final class C19972a {
            private C19972a() {
            }

            public /* synthetic */ C19972a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            private final void m65872a(boolean z, boolean z2, View view, View view2, View view3) {
                boolean z3;
                C32343x.m95483r1(view, z, false, 2, (Object) null);
                boolean z4 = true;
                if (z || z2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                C32343x.m95483r1(view2, z3, false, 2, (Object) null);
                if (!z2 || z) {
                    z4 = false;
                }
                C32343x.m95483r1(view3, z4, false, 2, (Object) null);
            }

            /* renamed from: b */
            public final void mo48340b(C29729q qVar, DepositBreakDetailItem depositBreakDetailItem) {
                boolean z;
                String str;
                C41536l.m120489i(qVar, "binding");
                C41536l.m120489i(depositBreakDetailItem, "item");
                Context context = qVar.mo3946b().getContext();
                C19972a aVar = C19971a.f54565e;
                if (depositBreakDetailItem.mo58001d() == null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean h = depositBreakDetailItem.mo58005h();
                SingleLineTextItem singleLineTextItem = qVar.f75137h;
                C41536l.m120488h(singleLineTextItem, "singleText");
                TwoLineTextItem twoLineTextItem = qVar.f75134e;
                C41536l.m120488h(twoLineTextItem, "doubleText");
                TwoLineReverseTextItem twoLineReverseTextItem = qVar.f75135f;
                C41536l.m120488h(twoLineReverseTextItem, "doubleTextReversed");
                aVar.m65872a(z, h, singleLineTextItem, twoLineTextItem, twoLineReverseTextItem);
                SingleLineTextItem singleLineTextItem2 = qVar.f75137h;
                Color g = depositBreakDetailItem.mo58004g();
                C41536l.m120488h(context, "context");
                singleLineTextItem2.setTextColorInt(g.mo35260a(context));
                qVar.f75134e.setTitleColorInt(depositBreakDetailItem.mo58004g().mo35260a(context));
                qVar.f75134e.setTextColorInt(depositBreakDetailItem.mo58002e().mo35260a(context));
                qVar.f75135f.setTitleColorInt(depositBreakDetailItem.mo58004g().mo35260a(context));
                qVar.f75135f.setTextColorInt(depositBreakDetailItem.mo58002e().mo35260a(context));
                qVar.f75136g.setTextColor(depositBreakDetailItem.mo58000b().mo35260a(context));
                if (depositBreakDetailItem.mo58001d() == null) {
                    qVar.f75137h.setText(C34646b.m101752f(depositBreakDetailItem.mo58003f(), (Context) null, 1, (Object) null));
                } else if (depositBreakDetailItem.mo58005h()) {
                    qVar.f75135f.setTitle(C34646b.m101752f(depositBreakDetailItem.mo58001d(), (Context) null, 1, (Object) null));
                    qVar.f75135f.setText(C34646b.m101752f(depositBreakDetailItem.mo58003f(), (Context) null, 1, (Object) null));
                } else {
                    qVar.f75134e.setTitle(C34646b.m101752f(depositBreakDetailItem.mo58001d(), (Context) null, 1, (Object) null));
                    qVar.f75134e.setText(C34646b.m101752f(depositBreakDetailItem.mo58003f(), (Context) null, 1, (Object) null));
                }
                AppCompatTextView appCompatTextView = qVar.f75136g;
                StringSource a = depositBreakDetailItem.mo57999a();
                if (a == null || (str = C34646b.m101752f(a, (Context) null, 1, (Object) null)) == null) {
                    str = "";
                }
                appCompatTextView.setText(str);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19971a(C29729q qVar) {
            super(qVar.mo3946b());
            C41536l.m120489i(qVar, "binding");
            this.f54566d = qVar;
        }

        /* renamed from: h */
        public final void mo48339h(DepositBreakDetailItem depositBreakDetailItem) {
            C41536l.m120489i(depositBreakDetailItem, "item");
            f54565e.mo48340b(this.f54566d, depositBreakDetailItem);
        }
    }

    public C19970a() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C19971a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo48339h((DepositBreakDetailItem) g);
    }

    /* renamed from: l */
    public C19971a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C29729q d = C29729q.m90282d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C19971a(d);
    }
}
