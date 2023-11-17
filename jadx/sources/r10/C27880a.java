package r10;

import android.view.View;
import android.widget.TextView;
import androidx.core.content.res.C0808h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10321j;
import p366bk.C10322k;
import p366bk.C10328q;
import t10.C28296a;
import t10.C28297b;
import t10.C28298c;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import x00.C29615f;

/* renamed from: r10.a */
public final class C27880a extends C29615f {

    /* renamed from: p */
    public static final C27881a f71017p = new C27881a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final boolean f71018f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C43075l f71019g;

    /* renamed from: h */
    private C28297b f71020h;

    /* renamed from: i */
    private C28298c f71021i;

    /* renamed from: j */
    private ArrayList f71022j;

    /* renamed from: k */
    private C43075l f71023k;

    /* renamed from: l */
    private C43079p f71024l;

    /* renamed from: m */
    private C43079p f71025m;

    /* renamed from: n */
    private C43064a f71026n;

    /* renamed from: o */
    private C43079p f71027o;

    /* renamed from: r10.a$a */
    public static final class C27881a {
        private C27881a() {
        }

        public /* synthetic */ C27881a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: r10.a$b */
    public final class C27882b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final TextView f71028d;

        /* renamed from: e */
        final /* synthetic */ C27880a f71029e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27882b(C27880a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f71029e = aVar;
            View findViewById = view.findViewById(C10322k.add_code_text_view);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.add_code_text_view)");
            this.f71028d = (TextView) findViewById;
            view.setOnClickListener(new C27884b(aVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m86144i(C27880a aVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C43075l E = aVar.f71019g;
            if (E != null) {
                C41536l.m120488h(view, "it");
                E.invoke(view);
            }
        }

        /* renamed from: j */
        public final void mo67423j() {
            int i;
            TextView textView = this.f71028d;
            if (this.f71029e.mo67414J()) {
                i = C10328q.contact_add_treasury_code;
            } else {
                i = C10328q.contact_add_new_account;
            }
            textView.setText(i);
        }
    }

    /* renamed from: r10.a$c */
    public final class C27883c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final TextView f71030d;

        /* renamed from: e */
        final /* synthetic */ C27880a f71031e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27883c(C27880a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f71031e = aVar;
            View findViewById = view.findViewById(C10322k.header_text_view);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.header_text_view)");
            this.f71030d = (TextView) findViewById;
        }

        /* renamed from: h */
        public final void mo67424h() {
            int i;
            TextView textView = this.f71030d;
            if (this.f71031e.mo67414J()) {
                i = C10328q.contact_edit_header;
            } else {
                i = C10328q.edit_contact_title_account_numbers;
            }
            textView.setText(i);
            this.f71030d.setTypeface(C0808h.m3033h(this.itemView.getContext(), C10321j.bog_headline_medium));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27880a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* renamed from: I */
    private final int m86128I() {
        return this.f71018f ? 5 : 3;
    }

    /* renamed from: F */
    public final void mo67411F(C28296a aVar) {
        C41536l.m120489i(aVar, "account");
        this.f71022j.add(aVar);
        mo69513f(m86128I(), 1);
    }

    /* renamed from: G */
    public final void mo67412G(C43064a aVar) {
        this.f71026n = aVar;
    }

    /* renamed from: H */
    public final void mo67413H(String str) {
        C41536l.m120489i(str, "accountNumber");
        Iterator it = this.f71022j.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C41536l.m120484d(((C28296a) it.next()).mo67926a(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.f71022j.remove(i);
            mo69518t(m86128I(), i);
        }
    }

    /* renamed from: J */
    public final boolean mo67414J() {
        return this.f71018f;
    }

    /* renamed from: K */
    public final void mo67415K(C43079p pVar) {
        this.f71024l = pVar;
    }

    /* renamed from: L */
    public final void mo67416L(C43079p pVar) {
        this.f71025m = pVar;
    }

    /* renamed from: M */
    public final void mo67417M(C43079p pVar) {
        C41536l.m120489i(pVar, "listener");
        this.f71027o = pVar;
    }

    /* renamed from: N */
    public final void mo67418N(C43075l lVar) {
        C41536l.m120489i(lVar, "clickListener");
        this.f71019g = lVar;
    }

    /* renamed from: O */
    public final void mo67419O(C43075l lVar) {
        C41536l.m120489i(lVar, "deleteListener");
        this.f71023k = lVar;
    }

    /* renamed from: P */
    public final void mo67420P(List list) {
        C41536l.m120489i(list, "accounts");
        ArrayList arrayList = this.f71022j;
        arrayList.clear();
        arrayList.addAll(list);
        C29615f.m89897A(this, 2, 1, false, 4, (Object) null);
        C29615f.m89897A(this, m86128I(), this.f71022j.size(), false, 4, (Object) null);
        C29615f.m89897A(this, 4, 1, false, 4, (Object) null);
    }

    /* renamed from: Q */
    public final void mo67421Q(C28297b bVar) {
        C41536l.m120489i(bVar, "contactNameItem");
        this.f71020h = bVar;
        C29615f.m89897A(this, 1, 1, false, 4, (Object) null);
    }

    /* renamed from: R */
    public final void mo67422R(C28298c cVar) {
        C41536l.m120489i(cVar, "profilePictureItem");
        this.f71021i = cVar;
        C29615f.m89897A(this, 0, 1, false, 4, (Object) null);
    }

    /* renamed from: l */
    public List mo48134l() {
        return C41341q.m119910m(new C29615f.C29617b(0, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(1, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(2, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(m86128I(), 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(4, 0, 2, (DefaultConstructorMarker) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: u10.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: u10.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: u10.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: u10.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: r10.a$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: u10.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: r10.a$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.recyclerview.widget.RecyclerView.C1734f0 onCreateViewHolder(android.view.ViewGroup r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            r0 = 0
            r1 = 2
            r2 = 0
            if (r6 == 0) goto L_0x009e
            r3 = 1
            if (r6 == r3) goto L_0x0083
            if (r6 == r1) goto L_0x006a
            r3 = 3
            if (r6 == r3) goto L_0x0059
            r0 = 4
            if (r6 == r0) goto L_0x0040
            r0 = 5
            if (r6 != r0) goto L_0x0025
            u10.d$a r6 = u10.C28539d.f72447h
            u10.d r5 = r6.mo68273a(r5)
            ue1.l r6 = r4.f71023k
            r5.mo68272k(r6)
            goto L_0x00af
        L_0x0025:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported view type, viewType = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x0040:
            r10.a$b r6 = new r10.a$b
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = p366bk.C10324m.item_edit_contact_add_new_account
            android.view.View r5 = r0.inflate(r1, r5, r2)
            java.lang.String r0 = "from(parent.context)\n   …w_account, parent, false)"
            kotlin.jvm.internal.C41536l.m120488h(r5, r0)
            r6.<init>(r4, r5)
            goto L_0x00ae
        L_0x0059:
            u10.b r6 = new u10.b
            int r3 = p366bk.C10324m.item_edit_contact_account
            android.view.View r5 = g91.C32343x.m95473o0(r5, r3, r2, r1, r0)
            r6.<init>(r5)
            ue1.l r5 = r4.f71023k
            r6.mo68269k(r5)
            goto L_0x00ae
        L_0x006a:
            r10.a$c r6 = new r10.a$c
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = p366bk.C10324m.item_edit_contact_account_numbers_title
            android.view.View r5 = r0.inflate(r1, r5, r2)
            java.lang.String r0 = "from(parent.context)\n   …ers_title, parent, false)"
            kotlin.jvm.internal.C41536l.m120488h(r5, r0)
            r6.<init>(r4, r5)
            goto L_0x00ae
        L_0x0083:
            u10.h r6 = new u10.h
            int r3 = p366bk.C10324m.item_edit_contact_name
            android.view.View r5 = g91.C32343x.m95473o0(r5, r3, r2, r1, r0)
            r6.<init>(r5)
            ue1.p r5 = r4.f71024l
            r6.mo68278o(r5)
            ue1.p r5 = r4.f71025m
            r6.mo68279p(r5)
            ue1.p r5 = r4.f71027o
            r6.mo68280q(r5)
            goto L_0x00ae
        L_0x009e:
            u10.j r6 = new u10.j
            int r3 = p366bk.C10324m.item_edit_contact_profile_image
            android.view.View r5 = g91.C32343x.m95473o0(r5, r3, r2, r1, r0)
            r6.<init>(r5)
            ue1.a r5 = r4.f71026n
            r6.mo68283k(r5)
        L_0x00ae:
            r5 = r6
        L_0x00af:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.C27880a.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$f0");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: t10.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: t10.c} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo48135p(androidx.recyclerview.widget.RecyclerView.C1734f0 r2, int r3, int r4) {
        /*
            r1 = this;
            java.lang.String r3 = "holder"
            kotlin.jvm.internal.C41536l.m120489i(r2, r3)
            boolean r3 = r2 instanceof u10.C28546j
            r0 = 0
            if (r3 == 0) goto L_0x001b
            u10.j r2 = (u10.C28546j) r2
            t10.c r3 = r1.f71021i
            if (r3 != 0) goto L_0x0016
            java.lang.String r3 = "profilePictureItem"
            kotlin.jvm.internal.C41536l.m120506z(r3)
            goto L_0x0017
        L_0x0016:
            r0 = r3
        L_0x0017:
            r2.mo68282i(r0)
            goto L_0x006f
        L_0x001b:
            boolean r3 = r2 instanceof u10.C28544h
            if (r3 == 0) goto L_0x0030
            u10.h r2 = (u10.C28544h) r2
            t10.b r3 = r1.f71020h
            if (r3 != 0) goto L_0x002b
            java.lang.String r3 = "contactNameItem"
            kotlin.jvm.internal.C41536l.m120506z(r3)
            goto L_0x002c
        L_0x002b:
            r0 = r3
        L_0x002c:
            r2.mo68277k(r0)
            goto L_0x006f
        L_0x0030:
            boolean r3 = r2 instanceof u10.C28537b
            java.lang.String r0 = "accountItems[positionInSection]"
            if (r3 == 0) goto L_0x0047
            u10.b r2 = (u10.C28537b) r2
            java.util.ArrayList r3 = r1.f71022j
            java.lang.Object r3 = r3.get(r4)
            kotlin.jvm.internal.C41536l.m120488h(r3, r0)
            t10.a r3 = (t10.C28296a) r3
            r2.mo68268i(r3)
            goto L_0x006f
        L_0x0047:
            boolean r3 = r2 instanceof u10.C28539d
            if (r3 == 0) goto L_0x005c
            u10.d r2 = (u10.C28539d) r2
            java.util.ArrayList r3 = r1.f71022j
            java.lang.Object r3 = r3.get(r4)
            kotlin.jvm.internal.C41536l.m120488h(r3, r0)
            t10.a r3 = (t10.C28296a) r3
            r2.mo68271i(r3)
            goto L_0x006f
        L_0x005c:
            boolean r3 = r2 instanceof r10.C27880a.C27883c
            if (r3 == 0) goto L_0x0066
            r10.a$c r2 = (r10.C27880a.C27883c) r2
            r2.mo67424h()
            goto L_0x006f
        L_0x0066:
            boolean r3 = r2 instanceof r10.C27880a.C27882b
            if (r3 == 0) goto L_0x006f
            r10.a$b r2 = (r10.C27880a.C27882b) r2
            r2.mo67423j()
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.C27880a.mo48135p(androidx.recyclerview.widget.RecyclerView$f0, int, int):void");
    }

    public C27880a(boolean z) {
        this.f71018f = z;
        this.f71022j = new ArrayList();
    }
}
