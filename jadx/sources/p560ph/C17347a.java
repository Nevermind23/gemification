package p560ph;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.C1817m;
import androidx.recyclerview.widget.RecyclerView;
import he1.C41224m;
import he1.C41233s;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p588rh.C17615a;
import p601sg.C17785j;

/* renamed from: ph.a */
public final class C17347a extends RecyclerView.C1736h {

    /* renamed from: d */
    private final C17348a f48661d;

    /* renamed from: e */
    private List f48662e = C41341q.m119907j();

    /* renamed from: ph.a$a */
    public enum C17348a {
        MONTH,
        DAY
    }

    /* renamed from: ph.a$b */
    public final class C17349b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C17355e f48666d;

        /* renamed from: e */
        final /* synthetic */ C17347a f48667e;

        /* renamed from: ph.a$b$a */
        public static final class C17350a extends C1817m {

            /* renamed from: q */
            final /* synthetic */ C17355e f48668q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C17350a(C17355e eVar, Context context) {
                super(context);
                this.f48668q = eVar;
            }

            /* renamed from: t */
            public int mo6017t(View view, int i) {
                int i2;
                if (!(view instanceof C17355e)) {
                    return 0;
                }
                int t = super.mo6017t(view, -1);
                int t2 = super.mo6017t(view, 1);
                C17355e eVar = (C17355e) view;
                int e = eVar.mo44766e();
                int i3 = (t + t2) / 2;
                C17355e eVar2 = this.f48668q;
                if (eVar2 == null) {
                    return i3;
                }
                if (view instanceof C17615a) {
                    i2 = ((eVar2.getWidth() - eVar.getViewType().mo44790c().mo44784d()) / 2) + ((e - ((C17615a) view).getWidth()) / 3);
                } else {
                    i2 = (e - eVar.getWidth()) / 2;
                }
                if (i3 > 0) {
                    return i3 - i2;
                }
                return i3 + i2;
            }

            /* access modifiers changed from: protected */
            /* renamed from: x */
            public int mo6021x(int i) {
                return super.mo6021x(i) + 60;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17349b(C17347a aVar, C17355e eVar) {
            super(eVar);
            C41536l.m120489i(eVar, "carouselOvalView");
            this.f48667e = aVar;
            this.f48666d = eVar;
        }

        /* renamed from: i */
        private final C41224m m60721i(RecyclerView recyclerView) {
            View view;
            C17355e eVar;
            int adapterPosition = getAdapterPosition() - 5;
            int adapterPosition2 = getAdapterPosition() + 5;
            if (adapterPosition <= adapterPosition2) {
                while (true) {
                    RecyclerView.C1747p layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        view = layoutManager.mo5199O(adapterPosition);
                    } else {
                        view = null;
                    }
                    if (view instanceof C17355e) {
                        eVar = (C17355e) view;
                    } else {
                        eVar = null;
                    }
                    if (eVar == null || !C41536l.m120484d(eVar.getAppliedType(), eVar.getViewType().mo44789b())) {
                        if (adapterPosition == adapterPosition2) {
                            break;
                        }
                        adapterPosition++;
                    } else {
                        return C41233s.m119492a(eVar, Integer.valueOf(adapterPosition));
                    }
                }
            }
            return C41233s.m119492a((Object) null, (Object) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m60722k(C17349b bVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            ViewParent parent = bVar.f48666d.getParent();
            C41536l.m120487g(parent, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) parent;
            C41224m i = bVar.m60721i(recyclerView);
            C17355e eVar = (C17355e) i.mo95675a();
            Integer num = (Integer) i.mo95676b();
            int adapterPosition = bVar.getAdapterPosition();
            if (num == null || num.intValue() != adapterPosition) {
                bVar.m60723l(recyclerView, bVar.getAdapterPosition(), eVar);
            }
        }

        /* renamed from: l */
        private final void m60723l(RecyclerView recyclerView, int i, C17355e eVar) {
            C17350a aVar = new C17350a(eVar, recyclerView.getContext());
            aVar.mo5452p(i);
            RecyclerView.C1747p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo5662W1(aVar);
            }
        }

        /* renamed from: j */
        public final void mo44762j(int i) {
            String str;
            this.f48666d.setValue(String.valueOf(i));
            C17355e eVar = this.f48666d;
            if (!(eVar instanceof C17615a)) {
                str = null;
            } else if (i > 1) {
                str = this.itemView.getContext().getString(C17785j.months);
            } else {
                str = this.itemView.getContext().getString(C17785j.f49819w);
            }
            eVar.setSuffix(str);
            this.f48666d.setOnClickListener(new C17352b(this));
        }
    }

    /* renamed from: ph.a$c */
    public /* synthetic */ class C17351c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48669a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ph.a$a[] r0 = p560ph.C17347a.C17348a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ph.a$a r1 = p560ph.C17347a.C17348a.MONTH     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ph.a$a r1 = p560ph.C17347a.C17348a.DAY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f48669a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p560ph.C17347a.C17351c.<clinit>():void");
        }
    }

    public C17347a(C17348a aVar) {
        C41536l.m120489i(aVar, "carouselViewType");
        this.f48661d = aVar;
    }

    /* renamed from: f */
    public void onBindViewHolder(C17349b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        bVar.mo44762j(((Number) this.f48662e.get(i % this.f48662e.size())).intValue());
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [ph.e] */
    /* JADX WARNING: type inference failed for: r0v3, types: [rh.a] */
    /* JADX WARNING: type inference failed for: r2v2, types: [qh.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p560ph.C17347a.C17349b onCreateViewHolder(android.view.ViewGroup r9, int r10) {
        /*
            r8 = this;
            java.lang.String r10 = "parent"
            kotlin.jvm.internal.C41536l.m120489i(r9, r10)
            ph.a$a r10 = r8.f48661d
            int[] r0 = p560ph.C17347a.C17351c.f48669a
            int r10 = r10.ordinal()
            r10 = r0[r10]
            r0 = 1
            java.lang.String r1 = "parent.context"
            if (r10 == r0) goto L_0x002f
            r0 = 2
            if (r10 != r0) goto L_0x0029
            qh.a r10 = new qh.a
            android.content.Context r3 = r9.getContext()
            kotlin.jvm.internal.C41536l.m120488h(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0041
        L_0x0029:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L_0x002f:
            rh.a r10 = new rh.a
            android.content.Context r9 = r9.getContext()
            kotlin.jvm.internal.C41536l.m120488h(r9, r1)
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r10
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0041:
            ph.a$b r9 = new ph.a$b
            r9.<init>(r8, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p560ph.C17347a.onCreateViewHolder(android.view.ViewGroup, int):ph.a$b");
    }

    public int getItemCount() {
        return this.f48662e.isEmpty() ? 0 : Integer.MAX_VALUE;
    }

    /* renamed from: h */
    public final void mo44761h(List list) {
        C41536l.m120489i(list, "periodList");
        this.f48662e = list;
        notifyDataSetChanged();
    }
}
