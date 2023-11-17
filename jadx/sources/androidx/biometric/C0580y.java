package androidx.biometric;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0214c;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1483c;
import com.salesforce.marketingcloud.notifications.NotificationMessage;

@SuppressLint({"SyntheticAccessor"})
/* renamed from: androidx.biometric.y */
public class C0580y extends C1483c {

    /* renamed from: A */
    private Context f2388A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f2389B = true;

    /* renamed from: C */
    DialogInterface.OnClickListener f2390C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final DialogInterface.OnClickListener f2391D = new C0581a();

    /* renamed from: t */
    private C0585d f2392t = new C0585d();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Bundle f2393u;

    /* renamed from: v */
    private int f2394v;

    /* renamed from: w */
    private int f2395w;

    /* renamed from: x */
    private int f2396x;

    /* renamed from: y */
    private ImageView f2397y;

    /* renamed from: z */
    private TextView f2398z;

    /* renamed from: androidx.biometric.y$a */
    class C0581a implements DialogInterface.OnClickListener {

        /* renamed from: androidx.biometric.y$a$a */
        class C0582a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ DialogInterface f2400d;

            C0582a(DialogInterface dialogInterface) {
                this.f2400d = dialogInterface;
            }

            public void run() {
                C0580y.this.onCancel(this.f2400d);
            }
        }

        C0581a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -2) {
                C0554h0.m2168e("FingerprintDialogFrag", C0580y.this.getActivity(), C0580y.this.f2393u, new C0582a(dialogInterface));
            }
        }
    }

    /* renamed from: androidx.biometric.y$b */
    class C0583b implements DialogInterface.OnClickListener {
        C0583b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (C0580y.this.m2237U1()) {
                C0580y.this.f2391D.onClick(dialogInterface, i);
                return;
            }
            DialogInterface.OnClickListener onClickListener = C0580y.this.f2390C;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            } else {
                Log.w("FingerprintDialogFrag", "No suitable negative button listener.");
            }
        }
    }

    /* renamed from: androidx.biometric.y$c */
    class C0584c implements Runnable {
        C0584c() {
        }

        public void run() {
            C0580y.this.mo2469K1();
        }
    }

    /* renamed from: androidx.biometric.y$d */
    final class C0585d extends Handler {
        C0585d() {
        }

        public void handleMessage(Message message) {
            boolean z;
            switch (message.what) {
                case 1:
                    C0580y.this.m2236T1((CharSequence) message.obj);
                    return;
                case 2:
                    C0580y.this.m2235S1((CharSequence) message.obj);
                    return;
                case 3:
                    C0580y.this.m2233Q1((CharSequence) message.obj);
                    return;
                case 4:
                    C0580y.this.m2234R1();
                    return;
                case 5:
                    C0580y.this.mo2469K1();
                    return;
                case 6:
                    Context context = C0580y.this.getContext();
                    C0580y yVar = C0580y.this;
                    if (context == null || !C0554h0.m2170g(context, Build.MODEL)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean unused = yVar.f2389B = z;
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: J1 */
    private void m2229J1(CharSequence charSequence) {
        TextView textView = this.f2398z;
        if (textView != null) {
            textView.setTextColor(this.f2394v);
            if (charSequence != null) {
                this.f2398z.setText(charSequence);
            } else {
                this.f2398z.setText(C0550f0.fingerprint_error_lockout);
            }
        }
        this.f2392t.postDelayed(new C0584c(), (long) m2231N1(this.f2388A));
    }

    /* renamed from: L1 */
    private Drawable m2230L1(int i, int i2) {
        int i3;
        if (i == 0 && i2 == 1) {
            i3 = C0544c0.fingerprint_dialog_fp_to_error;
        } else if (i == 1 && i2 == 2) {
            i3 = C0544c0.fingerprint_dialog_fp_to_error;
        } else if (i == 2 && i2 == 1) {
            i3 = C0544c0.fingerprint_dialog_error_to_fp;
        } else if (i != 1 || i2 != 3) {
            return null;
        } else {
            i3 = C0544c0.fingerprint_dialog_error_to_fp;
        }
        return this.f2388A.getDrawable(i3);
    }

    /* renamed from: N1 */
    static int m2231N1(Context context) {
        return (context == null || !C0554h0.m2170g(context, Build.MODEL)) ? 2000 : 0;
    }

    /* renamed from: P1 */
    private int m2232P1(int i) {
        TypedValue typedValue = new TypedValue();
        this.f2388A.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = getActivity().obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public void m2233Q1(CharSequence charSequence) {
        if (this.f2389B) {
            mo2469K1();
        } else {
            m2229J1(charSequence);
        }
        this.f2389B = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public void m2234R1() {
        m2240Z1(1);
        TextView textView = this.f2398z;
        if (textView != null) {
            textView.setTextColor(this.f2395w);
            this.f2398z.setText(this.f2388A.getString(C0550f0.fingerprint_dialog_touch_sensor));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public void m2235S1(CharSequence charSequence) {
        m2240Z1(2);
        this.f2392t.removeMessages(4);
        TextView textView = this.f2398z;
        if (textView != null) {
            textView.setTextColor(this.f2394v);
            this.f2398z.setText(charSequence);
        }
        C0585d dVar = this.f2392t;
        dVar.sendMessageDelayed(dVar.obtainMessage(3), (long) m2231N1(this.f2388A));
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public void m2236T1(CharSequence charSequence) {
        m2240Z1(2);
        this.f2392t.removeMessages(4);
        TextView textView = this.f2398z;
        if (textView != null) {
            textView.setTextColor(this.f2394v);
            this.f2398z.setText(charSequence);
        }
        C0585d dVar = this.f2392t;
        dVar.sendMessageDelayed(dVar.obtainMessage(4), 2000);
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public boolean m2237U1() {
        return this.f2393u.getBoolean("allow_device_credential");
    }

    /* renamed from: V1 */
    static C0580y m2238V1() {
        return new C0580y();
    }

    /* renamed from: Y1 */
    private boolean m2239Y1(int i, int i2) {
        if (i == 0 && i2 == 1) {
            return false;
        }
        if (i == 1 && i2 == 2) {
            return true;
        }
        return i == 2 && i2 == 1;
    }

    /* renamed from: Z1 */
    private void m2240Z1(int i) {
        Drawable L1;
        AnimatedVectorDrawable animatedVectorDrawable;
        if (this.f2397y != null && (L1 = m2230L1(this.f2396x, i)) != null) {
            if (L1 instanceof AnimatedVectorDrawable) {
                animatedVectorDrawable = (AnimatedVectorDrawable) L1;
            } else {
                animatedVectorDrawable = null;
            }
            this.f2397y.setImageDrawable(L1);
            if (animatedVectorDrawable != null && m2239Y1(this.f2396x, i)) {
                animatedVectorDrawable.start();
            }
            this.f2396x = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public void mo2469K1() {
        if (getFragmentManager() == null) {
            Log.e("FingerprintDialogFrag", "Failed to dismiss fingerprint dialog fragment. Fragment manager was null.");
        } else {
            mo4578l1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M1 */
    public Handler mo2470M1() {
        return this.f2392t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public CharSequence mo2471O1() {
        return this.f2393u.getCharSequence("negative_text");
    }

    /* renamed from: W1 */
    public void mo2472W1(Bundle bundle) {
        this.f2393u = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X1 */
    public void mo2473X1(DialogInterface.OnClickListener onClickListener) {
        this.f2390C = onClickListener;
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C0586z zVar = (C0586z) getFragmentManager().mo4418k0("FingerprintHelperFragment");
        if (zVar != null) {
            zVar.mo2483n1(1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        this.f2388A = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2394v = m2232P1(16844099);
        } else {
            this.f2394v = C0767a.m2893c(context, C0542b0.biometric_error_color);
        }
        this.f2395w = m2232P1(16842808);
    }

    public void onPause() {
        super.onPause();
        this.f2392t.removeCallbacksAndMessages((Object) null);
    }

    public void onResume() {
        super.onResume();
        this.f2396x = 0;
        m2240Z1(1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("SavedBundle", this.f2393u);
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        CharSequence charSequence;
        if (bundle != null && this.f2393u == null) {
            this.f2393u = bundle.getBundle("SavedBundle");
        }
        C0214c.C0215a aVar = new C0214c.C0215a(getContext());
        aVar.setTitle(this.f2393u.getCharSequence("title"));
        View inflate = LayoutInflater.from(aVar.getContext()).inflate(C0548e0.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0546d0.fingerprint_subtitle);
        TextView textView2 = (TextView) inflate.findViewById(C0546d0.fingerprint_description);
        CharSequence charSequence2 = this.f2393u.getCharSequence(NotificationMessage.NOTIF_KEY_SUB_TITLE);
        if (TextUtils.isEmpty(charSequence2)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence2);
        }
        CharSequence charSequence3 = this.f2393u.getCharSequence("description");
        if (TextUtils.isEmpty(charSequence3)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(charSequence3);
        }
        this.f2397y = (ImageView) inflate.findViewById(C0546d0.fingerprint_icon);
        this.f2398z = (TextView) inflate.findViewById(C0546d0.fingerprint_error);
        if (m2237U1()) {
            charSequence = getString(C0550f0.confirm_device_credential_password);
        } else {
            charSequence = this.f2393u.getCharSequence("negative_text");
        }
        aVar.setNegativeButton(charSequence, (DialogInterface.OnClickListener) new C0583b());
        aVar.setView(inflate);
        C0214c create = aVar.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }
}
