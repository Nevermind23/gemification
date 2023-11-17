package c91;

import a91.C30901l;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import l81.C37104a;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35862c;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: c91.e */
public class C31302e extends C31355y implements C37104a {

    /* renamed from: v */
    protected int f77729v;

    /* renamed from: G1 */
    public boolean mo71549G1() {
        return true;
    }

    /* renamed from: J1 */
    public boolean mo67196J1() {
        return false;
    }

    /* renamed from: Z0 */
    public void mo48298Z0(int i) {
        mo71717U1(i + "");
        if (!(mo71707D1() == null || mo71621C1() == null)) {
            mo71707D1().setVisibleInput((String) mo71621C1().get(i));
        }
        this.f77883f.mo87965p3(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public RecyclerView.C1736h mo67193f2() {
        return new C30901l(mo71621C1(), this.f77729v, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g2 */
    public void mo71543g2() {
        if (this.f77729v >= 0) {
            mo71717U1(this.f77729v + "");
            if (mo71707D1() != null && mo71621C1() != null) {
                mo71707D1().setVisibleInput((String) mo71621C1().get(this.f77729v));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h2 */
    public void mo71550h2() {
        try {
            this.f77729v = Integer.parseInt(mo71611z1());
        } catch (Exception unused) {
            this.f77729v = -1;
            if (mo71707D1() != null && mo71707D1().getInputStyle() != 4) {
                int i = 0;
                while (true) {
                    if (i >= mo71621C1().size()) {
                        break;
                    } else if (mo71707D1().getSelectorOptionValues().get(i).equals(mo71707D1().getValue())) {
                        this.f77729v = i;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.f77889l.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f77889l.setAdapter(mo67193f2());
        if (TextUtils.isEmpty(mo71737x1())) {
            this.f77891n.setVisibility(8);
        } else {
            this.f77891n.setText(mo71737x1());
        }
        if (mo71707D1() != null && !TextUtils.isEmpty(mo71707D1().getDescriptionText())) {
            TextView textView = (TextView) findView(C10322k.description_txt);
            textView.setText(mo71707D1().getDescriptionText());
            textView.setVisibility(0);
        }
        mo71543g2();
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_simple_selector_wizard;
    }

    public void onActivityCreated(Bundle bundle) {
        boolean z;
        super.onActivityCreated(bundle);
        C35862c cVar = this.f77883f;
        if (this.f77729v > -1) {
            z = true;
        } else {
            z = false;
        }
        cVar.mo87965p3(z);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo71550h2();
        mo71730n1();
    }
}
