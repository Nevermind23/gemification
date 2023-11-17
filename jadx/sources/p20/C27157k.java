package p20;

import a30.C19159d;
import a30.C19166f;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32289b0;
import g91.C32343x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p366bk.C10320i;
import p90.C27475y5;

/* renamed from: p20.k */
public final class C27157k extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C27475y5 f68157d;

    /* renamed from: p20.k$a */
    public /* synthetic */ class C27158a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f68158a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                a30.f[] r0 = a30.C19166f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a30.f r1 = a30.C19166f.ADD_NEW_RECEIVER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                a30.f r1 = a30.C19166f.PHONE_NUMBER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                a30.f r1 = a30.C19166f.CONTACT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f68158a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p20.C27157k.C27158a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27157k(C27475y5 y5Var) {
        super(y5Var.mo3946b());
        C41536l.m120489i(y5Var, "binding");
        this.f68157d = y5Var;
    }

    /* renamed from: h */
    public final void mo66466h(C19159d dVar) {
        boolean z;
        int i;
        boolean z2;
        C41536l.m120489i(dVar, "item");
        Drawable drawable = null;
        this.f68157d.f70269f.setImageDrawable((Drawable) null);
        if (dVar.mo47383f() == null) {
            this.f68157d.f70269f.setImageResource(dVar.mo47378b());
        } else {
            C32289b0.m95097i(this.f68157d.f70269f, dVar.mo47383f());
        }
        String e = dVar.mo47381e();
        if (e == null || e.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !z;
        TextView textView = this.f68157d.f70271h;
        C41536l.m120488h(textView, "binding.phoneNumberText");
        C32343x.m95483r1(textView, z3, false, 2, (Object) null);
        TextView textView2 = this.f68157d.f70270g;
        if (z3) {
            i = 1;
        } else {
            i = 2;
        }
        textView2.setLines(i);
        this.f68157d.f70270g.setText(dVar.mo47384g());
        this.f68157d.f70271h.setText(dVar.mo47381e());
        ImageView imageView = this.f68157d.f70268e;
        C41536l.m120488h(imageView, "binding.badgeImage");
        if (dVar.mo47385h() != C19166f.ADD_NEW_RECEIVER) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32343x.m95483r1(imageView, z2, false, 2, (Object) null);
        ImageView imageView2 = this.f68157d.f70269f;
        int i2 = C27158a.f68158a[dVar.mo47385h().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                drawable = C0767a.m2895e(this.itemView.getContext(), C10320i.bg_circle_money_request_phone_number_receiver_picture);
            } else if (i2 == 3) {
                drawable = C0767a.m2895e(this.itemView.getContext(), C10320i.bg_circle_contact_image);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        imageView2.setBackground(drawable);
    }
}
