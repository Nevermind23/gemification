package q81;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import androidx.core.content.C0767a;
import g91.C32295c0;
import g91.C32355x0;
import p341ge.bog.mobilebank.p975ui.activities.CropActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10328q;
import p90.C27445v2;

/* renamed from: q81.b */
public class C38163b extends C38160a implements View.OnClickListener {

    /* renamed from: h */
    private C27445v2 f91576h;

    /* renamed from: i */
    private Activity f91577i;

    /* renamed from: j */
    private boolean f91578j;

    /* renamed from: k */
    private int[] f91579k;

    /* renamed from: l */
    private Runnable[] f91580l;

    /* renamed from: m */
    private int f91581m;

    /* renamed from: n */
    private int f91582n;

    public C38163b(Activity activity) {
        this(activity, new int[]{1, 2});
    }

    /* renamed from: l */
    private void m112291l() {
        C27445v2 v2Var = this.f91576h;
        View[] viewArr = {v2Var.f70067k, v2Var.f70061e, v2Var.f70062f, v2Var.f70065i};
        for (int i = 0; i < 4; i++) {
            viewArr[i].setVisibility(8);
        }
        for (int i2 : this.f91579k) {
            viewArr[i2].setVisibility(0);
        }
    }

    /* renamed from: c */
    public void mo91683c(int i, Intent intent) {
        String str;
        if (i == 139) {
            str = C32295c0.m95135g(this.f91577i);
        } else if (i == 140) {
            str = C32295c0.m95136h(intent, this.f91577i);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            Intent intent2 = new Intent(getContext(), CropActivity.class);
            intent2.putExtra("PHOTO_PATH", str);
            intent2.putExtra("CROP_OVAL", this.f91578j);
            this.f91577i.startActivityForResult(intent2, 10002);
        }
        dismiss();
    }

    /* renamed from: d */
    public void mo91684d(int i) {
        if (i == 1040) {
            C32295c0.m95139k(this.f91577i);
        } else if (i == 1041) {
            C32295c0.m95140l(this.f91577i);
        }
    }

    /* renamed from: e */
    public void mo91685e(int i) {
        this.f91581m = i;
    }

    /* renamed from: f */
    public void mo91686f(int i) {
        this.f91576h.f70062f.setText(i);
    }

    /* renamed from: g */
    public void mo91687g(int i) {
        this.f91576h.f70063g.setText(i);
    }

    /* renamed from: h */
    public void mo91688h(int i) {
        this.f91576h.f70064h.setText(i);
    }

    /* renamed from: i */
    public void mo91689i(int i) {
        BogTextView bogTextView = this.f91576h.f70064h;
        bogTextView.setTextColor(C0767a.m2893c(bogTextView.getContext(), i));
    }

    /* renamed from: j */
    public void mo91690j(Runnable[] runnableArr) {
        this.f91580l = runnableArr;
    }

    /* renamed from: k */
    public void mo91691k(int i) {
        this.f91582n = i;
    }

    public void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        C27445v2 v2Var = this.f91576h;
        if (view == v2Var.f70063g) {
            C32295c0.m95137i(this.f91577i, getContext().getString(this.f91581m));
        } else if (view == v2Var.f70062f) {
            C32295c0.m95138j(this.f91577i);
        } else if (view == v2Var.f70066j) {
            Runnable[] runnableArr = this.f91580l;
            if (runnableArr != null && runnableArr.length > 0 && (runnable2 = runnableArr[0]) != null) {
                runnable2.run();
            }
        } else {
            Runnable[] runnableArr2 = this.f91580l;
            if (runnableArr2 != null && runnableArr2.length > 1 && (runnable = runnableArr2[1]) != null) {
                runnable.run();
                dismiss();
            }
        }
    }

    public C38163b(Activity activity, int[] iArr) {
        super(activity);
        this.f91578j = true;
        this.f91581m = C10328q.camera_permission_desc;
        this.f91582n = C10328q.storage_permission_desc;
        this.f91577i = activity;
        this.f91579k = iArr;
        C27445v2 d = C27445v2.m85088d(getLayoutInflater());
        this.f91576h = d;
        setContentView(d.mo3946b());
        m112291l();
        if (getWindow() != null) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            int l = C32355x0.m95521l(activity);
            attributes.width = l - (l / 4);
            attributes.height = -2;
            getWindow().setAttributes(attributes);
        }
        this.f91576h.f70063g.setOnClickListener(this);
        this.f91576h.f70062f.setOnClickListener(this);
        this.f91576h.f70064h.setOnClickListener(this);
        this.f91576h.f70066j.setOnClickListener(this);
    }
}
