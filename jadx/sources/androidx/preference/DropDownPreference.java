package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference extends ListPreference {

    /* renamed from: R */
    private final Context f4712R;

    /* renamed from: S */
    private final ArrayAdapter f4713S;

    /* renamed from: T */
    private Spinner f4714T;

    /* renamed from: U */
    private final AdapterView.OnItemSelectedListener f4715U;

    /* renamed from: androidx.preference.DropDownPreference$a */
    class C1658a implements AdapterView.OnItemSelectedListener {
        C1658a() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.mo5033N()[i].toString();
                if (!charSequence.equals(DropDownPreference.this.mo5034O()) && DropDownPreference.this.mo5055a(charSequence)) {
                    DropDownPreference.this.mo5035Q(charSequence);
                }
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1677c.dropdownPreferenceStyle);
    }

    /* renamed from: S */
    private void m5782S() {
        this.f4713S.clear();
        if (mo5031L() != null) {
            for (CharSequence charSequence : mo5031L()) {
                this.f4713S.add(charSequence.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public ArrayAdapter mo5016R() {
        return new ArrayAdapter(this.f4712R, 17367049);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo5017w() {
        super.mo5017w();
        ArrayAdapter arrayAdapter = this.f4713S;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo5015y() {
        this.f4714T.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4715U = new C1658a();
        this.f4712R = context;
        this.f4713S = mo5016R();
        m5782S();
    }
}
