package c91;

import a91.C30907o;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import l81.C37104a;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardSubTemplateObject;
import p366bk.C10328q;

/* renamed from: c91.s */
public class C31331s<T extends AdvancedWizardActivity> extends C31330r<T> {

    /* renamed from: E */
    protected ArrayList f77806E;

    /* renamed from: F */
    protected C30907o f77807F;

    /* renamed from: G */
    C37104a f77808G = new C31333b();

    /* renamed from: c91.s$a */
    class C31332a implements Runnable {
        C31332a() {
        }

        public void run() {
            C31331s.this.mo71619r2();
        }
    }

    /* renamed from: c91.s$b */
    class C31333b implements C37104a {
        C31333b() {
        }

        /* renamed from: Z0 */
        public void mo48298Z0(int i) {
            C31331s.this.mo71559o2();
            C31331s.this.getArguments().putInt("WIZARD_FRAGMENT_SUB_RECYCLER_SELECTED", C31331s.this.f77807F.mo71127j());
            if (C31331s.this.f77807F.mo71127j() != -1) {
                C31331s.this.f77883f.mo87965p3(true);
                C31331s.this.mo71707D1().setSelectedSubTemplateItem(i);
            }
            String str = "";
            int i2 = 0;
            if (!C31331s.this.mo71707D1().isAmountObject()) {
                C31331s sVar = C31331s.this;
                if (!(sVar instanceof C31315m)) {
                    if (!(sVar instanceof C31315m)) {
                        ArrayList<KeyValue> arrayList = sVar.mo71707D1().getSubTemplateObjects().get(i).keyValues;
                        if (!TextUtils.isEmpty(C31331s.this.mo71707D1().getMask())) {
                            while (true) {
                                if (i2 >= arrayList.size()) {
                                    break;
                                }
                                KeyValue keyValue = arrayList.get(i2);
                                if (keyValue.getKey().equals(C31331s.this.mo71707D1().getId())) {
                                    StringBuilder sb = new StringBuilder(keyValue.getValue());
                                    for (int i3 = i2 + 1; i3 < arrayList.size(); i3++) {
                                        if (arrayList.get(i3).getKey().equals(keyValue.getKey())) {
                                            sb.append(C31331s.this.mo71707D1().getMask().replaceAll(C31331s.this.mo71707D1().getMaskChar(), str));
                                            sb.append(arrayList.get(i3).getValue());
                                        }
                                    }
                                    C31331s.this.mo71607t1().setValue(sb.toString());
                                    C31331s.this.mo71556l2(sb.toString());
                                    str = keyValue.getKey();
                                } else {
                                    i2++;
                                }
                            }
                        }
                        C31331s.this.f77805D.mo87836M3(arrayList, str);
                    }
                    C31331s.this.mo71557n2();
                }
            }
            if (C31331s.this.f77807F.mo71127j() == -1) {
                C31331s.this.mo71607t1().resetValue();
                C31331s.this.mo71555k2();
                C31331s.this.mo71707D1().setSelectedSubTemplateItem(-1);
                C31331s.this.f77807F.mo71130m(-1);
                C31331s.this.mo71554j2(str, 0, 0, 0);
            } else {
                C31331s sVar2 = C31331s.this;
                if (sVar2 instanceof C31315m) {
                    sVar2.mo71607t1().setValue(C31331s.this.mo71707D1().getSubTemplateObjects().get(i).preview);
                } else {
                    BogInputLayout t1 = sVar2.mo71607t1();
                    t1.setValue(C31331s.this.mo71707D1().getSubTemplateObjects().get(i).preview + " ₾");
                }
                C31331s sVar3 = C31331s.this;
                sVar3.mo71556l2(sVar3.mo71707D1().getSubTemplateObjects().get(i).preview);
                C31331s sVar4 = C31331s.this;
                if (!(sVar4 instanceof C31315m)) {
                    sVar4.f77805D.mo87834K3(sVar4.mo71734s1());
                }
            }
            C31331s.this.mo71557n2();
        }
    }

    /* renamed from: s2 */
    private LinearLayoutManager m93076s2() {
        return new LinearLayoutManager(getContext(), 0, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j2 */
    public void mo71554j2(CharSequence charSequence, int i, int i2, int i3) {
        super.mo71554j2(charSequence, i, i2, i3);
        mo71707D1().setSelectedSubTemplateItem(-1);
        this.f77807F.mo71130m(-1);
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        ArrayList<WizardSubTemplateObject> subTemplateObjects = mo71707D1().getSubTemplateObjects();
        this.f77806E = subTemplateObjects;
        this.f77807F = new C30907o(subTemplateObjects, mo71707D1().getSelectedSubTemplateItem(), this.f77808G);
        ArrayList arrayList = this.f77806E;
        if (arrayList != null && arrayList.size() > 0) {
            this.f77802A.setAlpha(Utils.FLOAT_EPSILON);
            this.f77803B.setLayoutManager(m93076s2());
            this.f77803B.setAdapter(this.f77807F);
            if (TextUtils.isEmpty(mo71707D1().getSubTemplateObjectsTitle())) {
                str = getString(C10328q.payments_wizard_choose_pack);
            } else {
                str = mo71707D1().getSubTemplateObjectsTitle();
            }
            this.f77804C.setText(str);
            this.f77802A.postDelayed(new C31332a(), 200);
        }
    }
}
