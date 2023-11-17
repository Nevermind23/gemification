package p341ge.bog.mobilebank.transfers.other_transfer_type;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b71.C31137c;
import b71.C31141g;
import b71.C31145k;
import b71.C31146l;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.transfers.other_transfer_type.C34966e;
import p341ge.bog.mobilebank.transfers.other_transfer_type.C34971g;
import p90.C27358l5;
import p90.C27386o6;
import p90.C27395p6;
import p90.C27404q6;
import p90.C27413r6;
import p90.C27422s6;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.c */
public final class C34951c extends RecyclerView.C1736h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C34965d f84378d;

    /* renamed from: e */
    private final List f84379e = new ArrayList();

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.c$a */
    public static abstract class C34952a implements C34959b {

        /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.c$a$a */
        public static final class C34953a extends C34952a {

            /* renamed from: a */
            public static final C34953a f84380a = new C34953a();

            /* renamed from: b */
            private static final C34959b.C34960a f84381b = C34959b.C34960a.CONTACTS_LOADING_SKELETON;

            private C34953a() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public C34959b.C34960a mo85479a() {
                return f84381b;
            }
        }

        /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.c$a$b */
        public static final class C34954b extends C34952a {

            /* renamed from: a */
            private final C34966e.C34967a f84382a;

            /* renamed from: b */
            private final C34959b.C34960a f84383b = C34959b.C34960a.CONTACTS_LIST_TYPE;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C34954b(C34966e.C34967a aVar) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(aVar, "contactItem");
                this.f84382a = aVar;
            }

            /* renamed from: a */
            public C34959b.C34960a mo85479a() {
                return this.f84383b;
            }

            /* renamed from: b */
            public final C34966e.C34967a mo85480b() {
                return this.f84382a;
            }
        }

        /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.c$a$c */
        public static final class C34955c extends C34952a {

            /* renamed from: a */
            public static final C34955c f84384a = new C34955c();

            /* renamed from: b */
            private static final C34959b.C34960a f84385b = C34959b.C34960a.CONTACTS_LIST_HEADER_TYPE;

            private C34955c() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public C34959b.C34960a mo85479a() {
                return f84385b;
            }
        }

        /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.c$a$d */
        public static final class C34956d extends C34952a {

            /* renamed from: a */
            private final int f84386a;

            /* renamed from: b */
            private final String f84387b;

            /* renamed from: c */
            private final String f84388c;

            /* renamed from: d */
            private final C31141g f84389d;

            /* renamed from: e */
            private final boolean f84390e;

            /* renamed from: f */
            private final boolean f84391f;

            /* renamed from: g */
            private final Integer f84392g;

            /* renamed from: h */
            private final C34959b.C34960a f84393h;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C34956d(int i, String str, String str2, C31141g gVar, boolean z, boolean z2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, str, str2, gVar, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? null : num);
            }

            /* renamed from: a */
            public C34959b.C34960a mo85479a() {
                return this.f84393h;
            }

            /* renamed from: b */
            public final Integer mo85481b() {
                return this.f84392g;
            }

            /* renamed from: c */
            public final int mo85482c() {
                return this.f84386a;
            }

            /* renamed from: d */
            public final boolean mo85483d() {
                return this.f84391f;
            }

            /* renamed from: e */
            public final boolean mo85484e() {
                return this.f84390e;
            }

            /* renamed from: f */
            public final String mo85485f() {
                return this.f84388c;
            }

            /* renamed from: g */
            public final String mo85486g() {
                return this.f84387b;
            }

            /* renamed from: h */
            public final C31141g mo85487h() {
                return this.f84389d;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C34956d(int i, String str, String str2, C31141g gVar, boolean z, boolean z2, Integer num) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "title");
                C41536l.m120489i(str2, "text");
                C41536l.m120489i(gVar, "type");
                this.f84386a = i;
                this.f84387b = str;
                this.f84388c = str2;
                this.f84389d = gVar;
                this.f84390e = z;
                this.f84391f = z2;
                this.f84392g = num;
                this.f84393h = C34959b.C34960a.TRANSFER_EXTERNAL_LIST_TYPE;
            }
        }

        /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.c$a$e */
        public static final class C34957e extends C34952a {

            /* renamed from: a */
            private final String f84394a;

            /* renamed from: b */
            private final C31145k f84395b;

            /* renamed from: c */
            private final C34959b.C34960a f84396c = C34959b.C34960a.TRANSFER_LIST_TYPE_HEADER;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C34957e(String str, C31145k kVar) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "text");
                C41536l.m120489i(kVar, "type");
                this.f84394a = str;
                this.f84395b = kVar;
            }

            /* renamed from: a */
            public C34959b.C34960a mo85479a() {
                return this.f84396c;
            }

            /* renamed from: b */
            public final String mo85488b() {
                return this.f84394a;
            }

            /* renamed from: c */
            public final C31145k mo85489c() {
                return this.f84395b;
            }
        }

        /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.c$a$f */
        public static final class C34958f extends C34952a {

            /* renamed from: a */
            private final int f84397a;

            /* renamed from: b */
            private final String f84398b;

            /* renamed from: c */
            private final C31146l f84399c;

            /* renamed from: d */
            private final C34959b.C34960a f84400d = C34959b.C34960a.TRANSFER_WITHIN_BOG_LIST_TYPE;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C34958f(int i, String str, C31146l lVar) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "text");
                C41536l.m120489i(lVar, "type");
                this.f84397a = i;
                this.f84398b = str;
                this.f84399c = lVar;
            }

            /* renamed from: a */
            public C34959b.C34960a mo85479a() {
                return this.f84400d;
            }

            /* renamed from: b */
            public final int mo85490b() {
                return this.f84397a;
            }

            /* renamed from: c */
            public final String mo85491c() {
                return this.f84398b;
            }

            /* renamed from: d */
            public final C31146l mo85492d() {
                return this.f84399c;
            }
        }

        private C34952a() {
        }

        public /* synthetic */ C34952a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.c$b */
    public interface C34959b {

        /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.c$b$a */
        public enum C34960a {
            TRANSFER_LIST_TYPE_HEADER(0),
            TRANSFER_WITHIN_BOG_LIST_TYPE(1),
            TRANSFER_EXTERNAL_LIST_TYPE(2),
            CONTACTS_LIST_HEADER_TYPE(3),
            CONTACTS_LIST_TYPE(4),
            CONTACTS_LOADING_SKELETON(5);
            

            /* renamed from: d */
            private final int f84408d;

            private C34960a(int i) {
                this.f84408d = i;
            }

            /* renamed from: b */
            public final int mo85493b() {
                return this.f84408d;
            }
        }

        /* renamed from: a */
        C34960a mo85479a();
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.c$c */
    static final class C34961c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34951c f84409d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34961c(C34951c cVar) {
            super(1);
            this.f84409d = cVar;
        }

        /* renamed from: a */
        public final void mo85494a(C31146l lVar) {
            C41536l.m120489i(lVar, "it");
            this.f84409d.f84378d.mo85460b(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85494a((C31146l) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.c$d */
    static final class C34962d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34951c f84410d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34962d(C34951c cVar) {
            super(1);
            this.f84410d = cVar;
        }

        /* renamed from: a */
        public final void mo85495a(C31141g gVar) {
            C41536l.m120489i(gVar, "it");
            this.f84410d.f84378d.mo85459a(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85495a((C31141g) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.c$e */
    static final class C34963e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C34951c f84411d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34963e(C34951c cVar) {
            super(0);
            this.f84411d = cVar;
        }

        public final void invoke() {
            this.f84411d.f84378d.mo85461c();
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.other_transfer_type.c$f */
    static final class C34964f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34951c f84412d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34964f(C34951c cVar) {
            super(1);
            this.f84412d = cVar;
        }

        /* renamed from: a */
        public final void mo85496a(C34952a.C34954b bVar) {
            C41536l.m120489i(bVar, "it");
            this.f84412d.f84378d.mo85462d(bVar.mo85480b());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85496a((C34952a.C34954b) obj);
            return C41238w.f97225a;
        }
    }

    public C34951c(C34965d dVar) {
        C41536l.m120489i(dVar, "otherTransferTypeListAdapterCallback");
        this.f84378d = dVar;
    }

    /* renamed from: g */
    public final void mo85474g(List list) {
        C41536l.m120489i(list, "transferContactList");
        mo85477j();
        this.f84379e.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f84379e.size();
    }

    public int getItemViewType(int i) {
        return ((C34952a) this.f84379e.get(i)).mo85479a().mo85493b();
    }

    /* renamed from: h */
    public void onBindViewHolder(C31137c cVar, int i) {
        C41536l.m120489i(cVar, "holder");
        if (this.f84379e.get(i) instanceof C34952a.C34957e) {
            ((C34977h) cVar).mo85516h((C34952a) this.f84379e.get(i));
        } else if (this.f84379e.get(i) instanceof C34952a.C34958f) {
            C34978i iVar = (C34978i) cVar;
            iVar.mo85517i((C34952a) this.f84379e.get(i));
            iVar.mo85518j(new C34961c(this));
        } else if (this.f84379e.get(i) instanceof C34952a.C34956d) {
            C34971g gVar = (C34971g) cVar;
            gVar.mo85509i((C34952a) this.f84379e.get(i));
            gVar.mo85510j(new C34962d(this));
            gVar.mo85511m((C34952a) this.f84379e.get(i));
        } else if (this.f84379e.get(i) instanceof C34952a.C34955c) {
            C34971g.C34973b bVar = (C34971g.C34973b) cVar;
            bVar.mo85512i((C34952a) this.f84379e.get(i));
            bVar.mo85513j(new C34963e(this));
        } else if (this.f84379e.get(i) instanceof C34952a.C34954b) {
            C34971g.C34974c cVar2 = (C34971g.C34974c) cVar;
            cVar2.mo85514i((C34952a) this.f84379e.get(i));
            cVar2.mo85515j(new C34964f(this));
        }
    }

    /* renamed from: i */
    public C31137c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == C34959b.C34960a.TRANSFER_LIST_TYPE_HEADER.mo85493b()) {
            C27413r6 d = C27413r6.m84959d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
            return new C34977h(d);
        } else if (i == C34959b.C34960a.TRANSFER_WITHIN_BOG_LIST_TYPE.mo85493b()) {
            C27422s6 d2 = C27422s6.m84999d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …lse\n                    )");
            return new C34978i(d2);
        } else if (i == C34959b.C34960a.TRANSFER_EXTERNAL_LIST_TYPE.mo85493b()) {
            C27404q6 d3 = C27404q6.m84920d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …lse\n                    )");
            return new C34971g(d3);
        } else if (i == C34959b.C34960a.CONTACTS_LIST_HEADER_TYPE.mo85493b()) {
            C27395p6 d4 = C27395p6.m84885d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d4, "inflate(\n               …lse\n                    )");
            return new C34971g.C34973b(d4);
        } else if (i == C34959b.C34960a.CONTACTS_LOADING_SKELETON.mo85493b()) {
            C27358l5 d5 = C27358l5.m84742d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d5, "inflate(\n               …lse\n                    )");
            return new C34971g.C34976d(d5);
        } else if (i == C34959b.C34960a.CONTACTS_LIST_TYPE.mo85493b()) {
            C27386o6 d6 = C27386o6.m84849d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d6, "inflate(\n               …lse\n                    )");
            return new C34971g.C34974c(d6);
        } else {
            throw new UnsupportedOperationException("Unknown OtherTransferListViewType");
        }
    }

    /* renamed from: j */
    public final void mo85477j() {
        List list = this.f84379e;
        C34952a.C34953a aVar = C34952a.C34953a.f84380a;
        if (list.contains(aVar)) {
            this.f84379e.remove(aVar);
        }
    }

    /* renamed from: k */
    public final void mo85478k(List list) {
        C41536l.m120489i(list, "otherTransferListType");
        this.f84379e.clear();
        this.f84379e.addAll(list);
        notifyDataSetChanged();
    }
}
