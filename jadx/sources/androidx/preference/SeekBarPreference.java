package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

public class SeekBarPreference extends Preference {

    /* renamed from: G */
    int f4772G;

    /* renamed from: H */
    int f4773H;

    /* renamed from: I */
    private int f4774I;

    /* renamed from: J */
    private int f4775J;

    /* renamed from: K */
    boolean f4776K;

    /* renamed from: L */
    SeekBar f4777L;

    /* renamed from: M */
    private TextView f4778M;

    /* renamed from: N */
    boolean f4779N;

    /* renamed from: O */
    private boolean f4780O;

    /* renamed from: P */
    boolean f4781P;

    /* renamed from: Q */
    private final SeekBar.OnSeekBarChangeListener f4782Q;

    /* renamed from: R */
    private final View.OnKeyListener f4783R;

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1669a();

        /* renamed from: d */
        int f4784d;

        /* renamed from: e */
        int f4785e;

        /* renamed from: f */
        int f4786f;

        /* renamed from: androidx.preference.SeekBarPreference$SavedState$a */
        class C1669a implements Parcelable.Creator {
            C1669a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f4784d = parcel.readInt();
            this.f4785e = parcel.readInt();
            this.f4786f = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4784d);
            parcel.writeInt(this.f4785e);
            parcel.writeInt(this.f4786f);
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$a */
    class C1670a implements SeekBar.OnSeekBarChangeListener {
        C1670a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f4781P || !seekBarPreference.f4776K) {
                    seekBarPreference.mo5091N(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.mo5092O(i + seekBarPreference2.f4773H);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f4776K = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f4776K = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f4773H != seekBarPreference.f4772G) {
                seekBarPreference.mo5091N(seekBar);
            }
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$b */
    class C1671b implements View.OnKeyListener {
        C1671b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f4779N && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f4777L;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4782Q = new C1670a();
        this.f4783R = new C1671b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1681g.f4808C0, i, i2);
        this.f4773H = obtainStyledAttributes.getInt(C1681g.f4814F0, 0);
        mo5089K(obtainStyledAttributes.getInt(C1681g.f4810D0, 100));
        mo5090L(obtainStyledAttributes.getInt(C1681g.f4816G0, 0));
        this.f4779N = obtainStyledAttributes.getBoolean(C1681g.f4812E0, true);
        this.f4780O = obtainStyledAttributes.getBoolean(C1681g.f4818H0, false);
        this.f4781P = obtainStyledAttributes.getBoolean(C1681g.f4820I0, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: M */
    private void m5854M(int i, boolean z) {
        int i2 = this.f4773H;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f4774I;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f4772G) {
            this.f4772G = i;
            mo5092O(i);
            mo5051F(i);
            if (z) {
                mo5017w();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Object mo5020A(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    /* renamed from: K */
    public final void mo5089K(int i) {
        int i2 = this.f4773H;
        if (i < i2) {
            i = i2;
        }
        if (i != this.f4774I) {
            this.f4774I = i;
            mo5017w();
        }
    }

    /* renamed from: L */
    public final void mo5090L(int i) {
        if (i != this.f4775J) {
            this.f4775J = Math.min(this.f4774I - this.f4773H, Math.abs(i));
            mo5017w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo5091N(SeekBar seekBar) {
        int progress = this.f4773H + seekBar.getProgress();
        if (progress == this.f4772G) {
            return;
        }
        if (mo5055a(Integer.valueOf(progress))) {
            m5854M(progress, false);
            return;
        }
        seekBar.setProgress(this.f4772G - this.f4773H);
        mo5092O(this.f4772G);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo5092O(int i) {
        TextView textView = this.f4778M;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1677c.seekBarPreferenceStyle);
    }
}
