package wl0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import he1.C41238w;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.header.statementheader.StatementHeaderView;
import p341ge.bog.designsystem.components.list.ListItem;
import p642vh.C18334a0;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43081r;
import wl0.C29469d;
import y71.C40029c;
import y71.C40034h;
import z71.C40187n;
import z71.C40188o;
import z71.C40189p;
import z71.C40190q;
import z71.C40191r;
import z71.C40192s;

/* renamed from: wl0.a */
public final class C29456a extends C1819o {

    /* renamed from: f */
    private final C43081r f74552f;

    /* renamed from: g */
    private final C43075l f74553g;

    /* renamed from: wl0.a$a */
    public static final class C29457a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C40189p f74554d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29457a(C40189p pVar) {
            super(pVar.mo3946b());
            C41536l.m120489i(pVar, "binding");
            this.f74554d = pVar;
            pVar.f95555e.setTitleText(pVar.mo3946b().getContext().getString(C40034h.details_for_reimbursement));
            pVar.f95555e.setCaptionText(C32343x.m95388F("text.travel.insurance.policy.contact.info", new Object[0]));
        }
    }

    /* renamed from: wl0.a$b */
    public static final class C29458b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C29459a f74555d;

        /* renamed from: wl0.a$b$a */
        public static final class C29459a extends C1819o {
            /* access modifiers changed from: private */

            /* renamed from: f */
            public final C43075l f74556f;

            /* renamed from: wl0.a$b$a$a */
            public static final class C29460a extends RecyclerView.C1734f0 {

                /* renamed from: d */
                private final C40187n f74557d;

                /* renamed from: e */
                private final C43075l f74558e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C29460a(C40187n nVar, C43075l lVar) {
                    super(nVar.mo94155c());
                    C41536l.m120489i(nVar, "binding");
                    C41536l.m120489i(lVar, "contactPhoneClicked");
                    this.f74557d = nVar;
                    this.f74558e = lVar;
                }

                /* access modifiers changed from: private */
                /* renamed from: j */
                public static final void m89582j(C29460a aVar, String str, View view) {
                    C41536l.m120489i(aVar, "this$0");
                    C41536l.m120489i(str, "$contact");
                    aVar.f74558e.invoke(str);
                }

                /* renamed from: i */
                public final void mo69309i(String str, boolean z) {
                    C41536l.m120489i(str, "contact");
                    this.f74557d.f95549f.setText(str);
                    this.f74557d.f95548e.setOnClickListener(new C29467b(this, str));
                    View view = this.f74557d.f95550g;
                    C41536l.m120488h(view, "binding.divider");
                    C32343x.m95480q1(view, z, true);
                }
            }

            /* renamed from: wl0.a$b$a$b */
            static final class C29461b extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C29459a f74559d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C29461b(C29459a aVar) {
                    super(1);
                    this.f74559d = aVar;
                }

                /* renamed from: a */
                public final void mo69310a(String str) {
                    C41536l.m120489i(str, "number");
                    this.f74559d.f74556f.invoke(str);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo69310a((String) obj);
                    return C41238w.f97225a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C29459a(C43075l lVar) {
                super(C37599g.f90345a.mo90787d());
                C41536l.m120489i(lVar, "contactPhoneClicked");
                this.f74556f = lVar;
            }

            /* renamed from: l */
            public void onBindViewHolder(C29460a aVar, int i) {
                C41536l.m120489i(aVar, "holder");
                boolean z = true;
                if (i == getItemCount() - 1) {
                    z = false;
                }
                Object g = mo6027g(i);
                C41536l.m120488h(g, "getItem(position)");
                aVar.mo69309i((String) g, z);
            }

            /* renamed from: m */
            public C29460a onCreateViewHolder(ViewGroup viewGroup, int i) {
                C41536l.m120489i(viewGroup, "parent");
                C40187n d = C40187n.m116456d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
                return new C29460a(d, new C29461b(this));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29458b(C40188o oVar, C43075l lVar) {
            super(oVar.mo3946b());
            C41536l.m120489i(oVar, "binding");
            C41536l.m120489i(lVar, "contactPhoneClicked");
            C29459a aVar = new C29459a(lVar);
            this.f74555d = aVar;
            oVar.f95552e.setAdapter(aVar);
            oVar.f95553f.setTitle(C32343x.m95388F("text.travel.insurance.policy.contact.assistance", new Object[0]));
        }

        /* renamed from: h */
        public final void mo69306h(List list) {
            C41536l.m120489i(list, "numbers");
            this.f74555d.mo6029i(list);
        }
    }

    /* renamed from: wl0.a$c */
    private enum C29462c {
        HEADER,
        CONTACT_INFO,
        CONTACTS,
        POLICY,
        PERSONAL_INFO
    }

    /* renamed from: wl0.a$d */
    public static final class C29463d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C40190q f74566d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C43081r f74567e;

        /* renamed from: wl0.a$d$a */
        static final class C29464a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C29463d f74568d;

            /* renamed from: e */
            final /* synthetic */ C29469d.C29472c f74569e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C29464a(C29463d dVar, C29469d.C29472c cVar) {
                super(0);
                this.f74568d = dVar;
                this.f74569e = cVar;
            }

            public final void invoke() {
                this.f74568d.f74567e.invoke(this.f74569e.mo69322d(), this.f74569e.mo69321c(), Long.valueOf(this.f74569e.mo69319a()), this.f74569e.mo69323e());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29463d(C40190q qVar, C43081r rVar) {
            super(qVar.mo3946b());
            C41536l.m120489i(qVar, "binding");
            C41536l.m120489i(rVar, "downloadPolicyClicked");
            this.f74566d = qVar;
            this.f74567e = rVar;
        }

        /* renamed from: i */
        public final void mo69311i(C29469d.C29472c cVar) {
            C41536l.m120489i(cVar, "header");
            StatementHeaderView statementHeaderView = this.f74566d.f95557e;
            statementHeaderView.setImage(new StatementHeaderView.C13338c(cVar.mo69320b(), (Color) null, (Color) null, (Color) null, (C18334a0) null, true, 30, (DefaultConstructorMarker) null));
            statementHeaderView.setIncludeTopSpacing(false);
            statementHeaderView.setTitle(cVar.mo69325f());
            statementHeaderView.setSubtitle(C32343x.m95388F("text.travel.insurance.policy.no", new Object[0]));
            statementHeaderView.setText(cVar.mo69321c());
            C41536l.m120488h(statementHeaderView, "bind$lambda$0");
            int i = C40029c.icons_24_system_download;
            String string = statementHeaderView.getContext().getString(C40034h.details_download_policy);
            C41536l.m120488h(string, "context.getString(R.stri….details_download_policy)");
            StatementHeaderView.m50190c(statementHeaderView, i, string, (Integer) null, new C29464a(this, cVar), 4, (Object) null);
        }
    }

    /* renamed from: wl0.a$e */
    public static final class C29465e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C40191r f74570d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29465e(C40191r rVar) {
            super(rVar.mo3946b());
            C41536l.m120489i(rVar, "binding");
            this.f74570d = rVar;
        }

        /* renamed from: h */
        public final void mo69312h(C29469d.C29473d dVar) {
            C41536l.m120489i(dVar, "data");
            C40191r rVar = this.f74570d;
            rVar.f95561g.setTitle(rVar.mo3946b().getContext().getString(C40034h.title_personal_information));
            rVar.f95559e.setTitle(rVar.mo3946b().getContext().getString(C40034h.details_full_name));
            rVar.f95559e.setText(dVar.mo69328a());
            rVar.f95560f.setTitle(rVar.mo3946b().getContext().getString(C40034h.details_id_number));
            rVar.f95560f.setText(dVar.mo69329b());
        }
    }

    /* renamed from: wl0.a$f */
    public static final class C29466f extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C40192s f74571d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29466f(C40192s sVar) {
            super(sVar.mo3946b());
            C41536l.m120489i(sVar, "binding");
            this.f74571d = sVar;
        }

        /* renamed from: h */
        public final void mo69313h(C29469d.C29474e eVar) {
            boolean z;
            C41536l.m120489i(eVar, "data");
            C40192s sVar = this.f74571d;
            sVar.f95565g.setText(eVar.mo69334b());
            sVar.f95569k.setText(eVar.mo69335c());
            sVar.f95563e.setText(eVar.mo69333a());
            sVar.f95571m.setTitle(sVar.mo3946b().getContext().getString(C40034h.title_policy_details));
            sVar.f95568j.setText(sVar.mo3946b().getContext().getString(C40034h.details_coverage_limit));
            sVar.f95570l.setText(sVar.mo3946b().getContext().getString(C40034h.details_activation_date));
            sVar.f95564f.setText(sVar.mo3946b().getContext().getString(C40034h.details_end_date));
            View view = sVar.f95567i;
            C41536l.m120488h(view, "limitDivider");
            boolean z2 = true;
            if (eVar.mo69334b().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(view, z, false, 2, (Object) null);
            ListItem listItem = sVar.f95566h;
            C41536l.m120488h(listItem, "limitContainer");
            if (eVar.mo69334b().length() <= 0) {
                z2 = false;
            }
            C32343x.m95483r1(listItem, z2, false, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29456a(C43081r rVar, C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(rVar, "downloadPolicyClicked");
        C41536l.m120489i(lVar, "contactPhoneClicked");
        this.f74552f = rVar;
        this.f74553g = lVar;
    }

    public int getItemViewType(int i) {
        C29469d dVar = (C29469d) mo6027g(i);
        if (dVar instanceof C29469d.C29472c) {
            return C29462c.HEADER.ordinal();
        }
        if (dVar instanceof C29469d.C29470a) {
            return C29462c.CONTACT_INFO.ordinal();
        }
        if (dVar instanceof C29469d.C29471b) {
            return C29462c.CONTACTS.ordinal();
        }
        if (dVar instanceof C29469d.C29474e) {
            return C29462c.POLICY.ordinal();
        }
        if (dVar instanceof C29469d.C29473d) {
            return C29462c.PERSONAL_INFO.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C29469d dVar = (C29469d) mo6027g(i);
        if (dVar instanceof C29469d.C29472c) {
            ((C29463d) f0Var).mo69311i((C29469d.C29472c) dVar);
        } else if (dVar instanceof C29469d.C29471b) {
            ((C29458b) f0Var).mo69306h(((C29469d.C29471b) dVar).mo69315a());
        } else if (dVar instanceof C29469d.C29474e) {
            ((C29466f) f0Var).mo69313h((C29469d.C29474e) dVar);
        } else if (dVar instanceof C29469d.C29473d) {
            ((C29465e) f0Var).mo69312h((C29469d.C29473d) dVar);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C29462c.HEADER.ordinal()) {
            C40190q d = C40190q.m116468d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C29463d(d, this.f74552f);
        } else if (i == C29462c.CONTACT_INFO.ordinal()) {
            C40189p d2 = C40189p.m116464d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(inflater, parent, false)");
            return new C29457a(d2);
        } else if (i == C29462c.CONTACTS.ordinal()) {
            C40188o d3 = C40188o.m116460d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(inflater, parent, false)");
            return new C29458b(d3, this.f74553g);
        } else if (i == C29462c.POLICY.ordinal()) {
            C40192s d4 = C40192s.m116476d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(inflater, parent, false)");
            return new C29466f(d4);
        } else if (i == C29462c.PERSONAL_INFO.ordinal()) {
            C40191r d5 = C40191r.m116472d(from, viewGroup, false);
            C41536l.m120488h(d5, "inflate(inflater, parent, false)");
            return new C29465e(d5);
        } else {
            throw new UnsupportedOperationException("Unknown view type");
        }
    }
}
