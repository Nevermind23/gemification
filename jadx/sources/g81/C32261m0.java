package g81;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.C1907a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: g81.m0 */
public class C32261m0 extends C1907a {

    /* renamed from: c */
    private Context f79574c;

    /* renamed from: d */
    private int[] f79575d;

    /* renamed from: e */
    private int[] f79576e;

    /* renamed from: f */
    private String[] f79577f;

    /* renamed from: g */
    private String[] f79578g;

    /* renamed from: h */
    private int[] f79579h;

    public C32261m0(Context context, int[] iArr, int[] iArr2, String[] strArr, String[] strArr2, int[] iArr3) {
        this.f79575d = iArr;
        this.f79576e = iArr2;
        this.f79577f = strArr;
        this.f79578g = strArr2;
        this.f79579h = iArr3;
        this.f79574c = context;
    }

    /* renamed from: a */
    public void mo4594a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: d */
    public int mo6557d() {
        int[] iArr = this.f79575d;
        if (iArr == null) {
            return 0;
        }
        return iArr.length;
    }

    /* renamed from: h */
    public Object mo4596h(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f79574c).inflate(C10324m.user_tip_layout, (ViewGroup) null);
        ((ImageView) inflate.findViewById(C10322k.tip_image)).setImageResource(this.f79575d[i]);
        ((ImageView) inflate.findViewById(C10322k.tip_background)).setImageResource(this.f79576e[i]);
        int i2 = C10322k.tip_title;
        ((BogTextView) inflate.findViewById(i2)).setText(this.f79577f[i]);
        ((BogTextView) inflate.findViewById(i2)).setTextColor(this.f79579h[i]);
        int i3 = C10322k.tip_desc;
        ((BogTextView) inflate.findViewById(i3)).setText(this.f79578g[i]);
        ((BogTextView) inflate.findViewById(i3)).setTextColor(this.f79579h[i]);
        viewGroup.addView(inflate);
        return inflate;
    }

    /* renamed from: i */
    public boolean mo4597i(View view, Object obj) {
        return view == obj;
    }
}
