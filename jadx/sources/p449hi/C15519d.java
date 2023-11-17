package p449hi;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import he1.C41224m;
import kotlin.jvm.internal.C41536l;
import p601sg.C17779d;

/* renamed from: hi.d */
public final class C15519d extends RecyclerView.C1746o {

    /* renamed from: a */
    private final Context f44032a;

    /* renamed from: b */
    private final C15521e f44033b;

    /* renamed from: hi.d$a */
    public /* synthetic */ class C15520a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44034a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                hi.e[] r0 = p449hi.C15521e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                hi.e r1 = p449hi.C15521e.ContactHeader     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                hi.e r1 = p449hi.C15521e.StatementHeader     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f44034a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p449hi.C15519d.C15520a.<clinit>():void");
        }
    }

    public C15519d(Context context, C15521e eVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(eVar, "type");
        this.f44032a = context;
        this.f44033b = eVar;
    }

    /* renamed from: e */
    public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        C41224m mVar;
        C41224m mVar2;
        C41536l.m120489i(rect, "outRect");
        C41536l.m120489i(view, "view");
        C41536l.m120489i(recyclerView, "parent");
        C41536l.m120489i(b0Var, "state");
        int i = C15520a.f44034a[this.f44033b.ordinal()];
        Integer num = null;
        if (i == 1) {
            RecyclerView.C1747p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                num = Integer.valueOf(layoutManager.mo5686k0());
            }
            if (num != null && num.intValue() == 1) {
                mVar = new C41224m(Float.valueOf(this.f44032a.getResources().getDimension(C17779d.f49642K1)), Float.valueOf(this.f44032a.getResources().getDimension(C17779d.spacing_24)));
            } else if (num != null && num.intValue() == 2) {
                Resources resources = this.f44032a.getResources();
                int i2 = C17779d.f49642K1;
                mVar = new C41224m(Float.valueOf(resources.getDimension(i2) / ((float) 2)), Float.valueOf(this.f44032a.getResources().getDimension(i2)));
            } else if (num != null && num.intValue() == 3) {
                Resources resources2 = this.f44032a.getResources();
                int i3 = C17779d.f49642K1;
                mVar = new C41224m(Float.valueOf(resources2.getDimension(i3) / ((float) 2)), Float.valueOf(this.f44032a.getResources().getDimension(i3)));
            } else if (num != null && num.intValue() == 4) {
                mVar = new C41224m(Float.valueOf(this.f44032a.getResources().getDimension(C17779d.spacing_2) / ((float) 2)), Float.valueOf(this.f44032a.getResources().getDimension(C17779d.f49642K1)));
            } else {
                mVar = new C41224m(0, 0);
            }
            Object a = mVar.mo95675a();
            Object b = mVar.mo95676b();
            Number number = (Number) a;
            rect.left = number.intValue();
            rect.right = number.intValue();
            rect.bottom = ((Number) b).intValue();
        } else if (i == 2) {
            RecyclerView.C1747p layoutManager2 = recyclerView.getLayoutManager();
            if (layoutManager2 != null) {
                num = Integer.valueOf(layoutManager2.mo5686k0());
            }
            if (num != null && num.intValue() == 1) {
                mVar2 = new C41224m(Float.valueOf(this.f44032a.getResources().getDimension(C17779d.f49642K1)), 0);
            } else if (num != null && num.intValue() == 2) {
                mVar2 = new C41224m(Float.valueOf(this.f44032a.getResources().getDimension(C17779d.f49643O1) / ((float) 2)), 0);
            } else if (num != null && num.intValue() == 3) {
                mVar2 = new C41224m(Float.valueOf(this.f44032a.getResources().getDimension(C17779d.spacing_24) / ((float) 2)), 0);
            } else {
                mVar2 = new C41224m(0, 0);
            }
            Object a2 = mVar2.mo95675a();
            int intValue = ((Number) mVar2.mo95676b()).intValue();
            Number number2 = (Number) a2;
            rect.left = number2.intValue();
            rect.right = number2.intValue();
            rect.bottom = intValue;
        }
    }
}
