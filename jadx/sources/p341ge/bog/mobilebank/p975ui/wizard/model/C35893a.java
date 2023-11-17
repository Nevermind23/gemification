package p341ge.bog.mobilebank.p975ui.wizard.model;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import g91.C32290b1;
import java.util.ArrayList;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.p975ui.wizard.activities.BasicWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;

/* renamed from: ge.bog.mobilebank.ui.wizard.model.a */
public abstract class C35893a {

    /* renamed from: ge.bog.mobilebank.ui.wizard.model.a$a */
    public static class C35894a {

        /* renamed from: a */
        private ArrayList f86827a;

        /* renamed from: b */
        private int f86828b;

        /* renamed from: c */
        private Activity f86829c;

        /* renamed from: d */
        private int f86830d;

        /* renamed from: e */
        private String f86831e;

        /* renamed from: f */
        private Class f86832f = BasicWizardActivity.class;

        /* renamed from: g */
        private BaseWizardPlugin f86833g;

        /* renamed from: h */
        private BaseWizardPlugin f86834h;

        /* renamed from: i */
        private int f86835i = 10001;

        public C35894a(Activity activity) {
            this.f86829c = activity;
        }

        /* renamed from: a */
        public C35894a mo88134a(WizardObject wizardObject) {
            if (this.f86827a == null) {
                this.f86827a = new ArrayList();
            }
            this.f86827a.add(wizardObject);
            return this;
        }

        /* renamed from: b */
        public Intent mo88135b() {
            Intent intent = new Intent(this.f86829c, this.f86832f);
            intent.putExtra("WIZARD_OBJECTS", C42035e.m122121c(this.f86827a));
            intent.putExtra("WIZARD_PAGE_INDEX", this.f86828b);
            intent.putExtra("WIZARD_INPUT_Y_POSITION", this.f86830d);
            String str = this.f86831e;
            if (str != null) {
                intent.putExtra("ALERT_INTRO_TEXT", str);
            }
            BaseWizardPlugin baseWizardPlugin = this.f86833g;
            if (baseWizardPlugin != null) {
                intent.putExtra("WIZARD_CONTROLLER", C42035e.m122121c(baseWizardPlugin));
            }
            BaseWizardPlugin baseWizardPlugin2 = this.f86834h;
            if (baseWizardPlugin2 != null) {
                intent.putExtra("KOTLIN_WIZARD_CONTROLLER", (Parcelable) baseWizardPlugin2);
            }
            return intent;
        }

        /* renamed from: c */
        public C35894a mo88136c(View view) {
            this.f86830d = C32290b1.m95119i(view).top;
            return this;
        }

        /* renamed from: d */
        public C35894a mo88137d(Class cls) {
            this.f86832f = cls;
            return this;
        }

        /* renamed from: e */
        public C35894a mo88138e(int i) {
            this.f86835i = i;
            return this;
        }

        /* renamed from: f */
        public C35894a mo88139f(BaseWizardPlugin baseWizardPlugin) {
            this.f86833g = baseWizardPlugin;
            return this;
        }

        /* renamed from: g */
        public C35894a mo88140g(ArrayList arrayList) {
            this.f86827a = arrayList;
            return this;
        }

        /* renamed from: h */
        public C35894a mo88141h(int i) {
            this.f86828b = i;
            return this;
        }

        /* renamed from: i */
        public void mo88142i() {
            this.f86829c.startActivityForResult(mo88135b(), this.f86835i);
        }
    }

    /* renamed from: a */
    public static C35894a m106783a(Activity activity) {
        return new C35894a(activity);
    }
}
