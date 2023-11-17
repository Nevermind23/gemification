package tb1;

import ah1.C40314b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10214s;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import ib1.C36382c1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.sso_client.models.UserContact;
import p615tg.C17963d;
import sso.type.UserContactType;
import ua1.C28635d1;
import ua1.C28672q;
import ue1.C43064a;
import yg1.C43399a;

/* renamed from: tb1.j */
public final class C38751j extends Fragment {

    /* renamed from: i */
    public static final C38752a f92669i = new C38752a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f92670d = C41219i.m119469a(C41222k.NONE, new C38757d(this, (C41806a) null, (C43064a) null, new C38756c(this), (C43064a) null));

    /* renamed from: e */
    private C28672q f92671e;

    /* renamed from: f */
    private C38738a f92672f;

    /* renamed from: g */
    private final C38753b f92673g = new C38753b();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public UserContact f92674h;

    /* renamed from: tb1.j$a */
    public static final class C38752a {
        private C38752a() {
        }

        public /* synthetic */ C38752a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38751j mo92380a() {
            return new C38751j();
        }
    }

    /* renamed from: tb1.j$b */
    public final class C38753b extends C1819o {

        /* renamed from: f */
        private List f92675f = C41341q.m119907j();

        /* renamed from: tb1.j$b$a */
        public final class C38754a extends RecyclerView.C1734f0 {

            /* renamed from: d */
            private final C28635d1 f92677d;

            /* renamed from: e */
            final /* synthetic */ C38753b f92678e;

            /* renamed from: tb1.j$b$a$a */
            public /* synthetic */ class C38755a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f92679a;

                static {
                    int[] iArr = new int[UserContactType.values().length];
                    iArr[UserContactType.PHONE.ordinal()] = 1;
                    iArr[UserContactType.MAIL.ordinal()] = 2;
                    f92679a = iArr;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C38754a(C38753b bVar, C28635d1 d1Var) {
                super(d1Var.mo3946b());
                C41536l.m120489i(d1Var, "binding");
                this.f92678e = bVar;
                this.f92677d = d1Var;
            }

            /* access modifiers changed from: private */
            /* renamed from: j */
            public static final void m113471j(C38751j jVar, UserContact userContact, C38753b bVar, C38754a aVar, View view) {
                String str;
                C41536l.m120489i(jVar, "this$0");
                C41536l.m120489i(userContact, "$this_with");
                C41536l.m120489i(bVar, "this$1");
                C41536l.m120489i(aVar, "this$2");
                UserContact k1 = jVar.f92674h;
                if (k1 != null) {
                    str = k1.mo88418a();
                } else {
                    str = null;
                }
                if (C41536l.m120484d(str, userContact.mo88418a())) {
                    userContact = null;
                }
                jVar.f92674h = userContact;
                bVar.notifyDataSetChanged();
                aVar.m113472k();
            }

            /* renamed from: k */
            private final void m113472k() {
                C38751j jVar = C38751j.this;
                jVar.m113465s1(jVar.f92674h == null);
            }

            /* renamed from: i */
            public final void mo92384i(UserContact userContact) {
                int i;
                int i2;
                String str;
                int i3;
                C41536l.m120489i(userContact, "data");
                C38753b bVar = this.f92678e;
                C38751j jVar = C38751j.this;
                UserContactType f = userContact.mo88424f();
                if (f == null) {
                    i = -1;
                } else {
                    i = C38755a.f92679a[f.ordinal()];
                }
                if (i == 1) {
                    i2 = C10214s.icons_48_payment_category_phone_outline;
                } else if (i != 2) {
                    i2 = C10214s.icons_48_security_digipass_outline;
                } else {
                    i2 = C10214s.icons_48_contacts_email_close_outline;
                }
                this.f92677d.f72705e.setImageDrawable(C0767a.m2895e(jVar.requireContext(), i2));
                this.f92677d.f72707g.setText(userContact.mo88418a());
                this.f92677d.mo3946b().setOnClickListener(new C38758k(jVar, userContact, bVar, this));
                AppCompatImageView appCompatImageView = this.f92677d.f72708h;
                UserContact k1 = jVar.f92674h;
                if (k1 != null) {
                    str = k1.mo88418a();
                } else {
                    str = null;
                }
                if (C41536l.m120484d(str, userContact.mo88418a())) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                appCompatImageView.setVisibility(i3);
            }
        }

        public C38753b() {
            super(C17963d.f51158a.mo45633d());
        }

        public int getItemCount() {
            return this.f92675f.size();
        }

        /* renamed from: k */
        public void onBindViewHolder(C38754a aVar, int i) {
            C41536l.m120489i(aVar, "holder");
            aVar.mo92384i((UserContact) this.f92675f.get(i));
        }

        /* renamed from: l */
        public C38754a onCreateViewHolder(ViewGroup viewGroup, int i) {
            C41536l.m120489i(viewGroup, "parent");
            C28635d1 d = C28635d1.m87639d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …, false\n                )");
            return new C38754a(this, d);
        }

        /* renamed from: m */
        public final void mo92383m(List list) {
            C41536l.m120489i(list, "data");
            this.f92675f = list;
            notifyDataSetChanged();
        }
    }

    /* renamed from: tb1.j$c */
    public static final class C38756c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f92680d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38756c(Fragment fragment) {
            super(0);
            this.f92680d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f92680d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f92680d.requireActivity());
        }
    }

    /* renamed from: tb1.j$d */
    public static final class C38757d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f92681d;

        /* renamed from: e */
        final /* synthetic */ C41806a f92682e;

        /* renamed from: f */
        final /* synthetic */ C43064a f92683f;

        /* renamed from: g */
        final /* synthetic */ C43064a f92684g;

        /* renamed from: h */
        final /* synthetic */ C43064a f92685h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38757d(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f92681d = fragment;
            this.f92682e = aVar;
            this.f92683f = aVar2;
            this.f92684g = aVar3;
            this.f92685h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f92681d, this.f92682e, this.f92683f, this.f92684g, C41520a0.m120436b(C36382c1.class), this.f92685h);
        }
    }

    /* renamed from: n1 */
    private final C36382c1 m113460n1() {
        return (C36382c1) this.f92670d.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m113461o1(C38751j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        if (jVar.f92674h != null) {
            jVar.m113460n1().mo89192tn("select_contact", new C41224m[0]);
            C36382c1 n1 = jVar.m113460n1();
            UserContact userContact = jVar.f92674h;
            C41536l.m120486f(userContact);
            n1.mo89177my(userContact, true);
            C38738a aVar = jVar.f92672f;
            if (aVar != null) {
                aVar.mo92370A0();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m113462p1(C38751j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        jVar.m113460n1().mo89192tn("add_other_contact", new C41224m[0]);
        C38738a aVar = jVar.f92672f;
        if (aVar != null) {
            aVar.mo92371M();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m113463q1(C38751j jVar, List list) {
        Object obj;
        boolean z;
        C41536l.m120489i(jVar, "this$0");
        C41536l.m120488h(list, "data");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Boolean e = ((UserContact) obj).mo88422e();
            if (e != null) {
                z = e.booleanValue();
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        jVar.f92674h = (UserContact) obj;
        jVar.f92673g.mo92383m(list);
    }

    /* renamed from: r1 */
    private final int m113464r1() {
        return m113460n1().mo89190sx("DO_ADD_CONTACT_FROM_CARD_FLOW_ALLOWED") ? 0 : 8;
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final void m113465s1(boolean z) {
        C28672q qVar = this.f92671e;
        if (qVar == null) {
            C41536l.m120506z("binding");
            qVar = null;
        }
        qVar.f72889e.setLoading(z);
    }

    public void onAttach(Context context) {
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            this.f92672f = (C38743f) parentFragment;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ge.bog.sso_client.onboarding.steps.confirmphonesheet.ConfirmPhoneActionSheet");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28672q d = C28672q.m87802d(layoutInflater, viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, container, false)");
        this.f92671e = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ConstraintLayout c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDetach() {
        super.onDetach();
        this.f92672f = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C28672q qVar = this.f92671e;
        C28672q qVar2 = null;
        if (qVar == null) {
            C41536l.m120506z("binding");
            qVar = null;
        }
        RecyclerView recyclerView = qVar.f72891g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.f92673g);
        Drawable e = C0767a.m2895e(recyclerView.getContext(), C10214s.f28277I);
        if (e != null) {
            recyclerView.mo5351j(new C13364a(e, true, false));
            C28672q qVar3 = this.f92671e;
            if (qVar3 == null) {
                C41536l.m120506z("binding");
                qVar3 = null;
            }
            qVar3.f72889e.setOnClickListener(new C38748g(this));
            C28672q qVar4 = this.f92671e;
            if (qVar4 == null) {
                C41536l.m120506z("binding");
                qVar4 = null;
            }
            Button button = qVar4.f72890f;
            button.setOnClickListener(new C38749h(this));
            button.setVisibility(m113464r1());
            C28672q qVar5 = this.f92671e;
            if (qVar5 == null) {
                C41536l.m120506z("binding");
            } else {
                qVar2 = qVar5;
            }
            qVar2.f72893i.setVisibility(m113464r1());
            m113460n1().mo89138Kx().mo4819k(getViewLifecycleOwner(), new C38750i(this));
            m113460n1().mo89146Sx();
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
