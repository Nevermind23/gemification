package p341ge.bog.mobilebank.p975ui.wizard.model;

import java.util.ArrayList;
import org.parceler.Parcel;
import p341ge.bog.mobilebank.model.KeyValue;

@Parcel
/* renamed from: ge.bog.mobilebank.ui.wizard.model.WizardSubTemplateObject */
public class WizardSubTemplateObject {
    public String imageUrl;
    public ArrayList<KeyValue> keyValues;
    public String preview;
    public String subTitle;
    public String title;
    public String value;

    public WizardSubTemplateObject() {
    }

    public WizardSubTemplateObject(String str, String str2, String str3, String str4, String str5) {
        this.imageUrl = str;
        this.title = str2;
        this.subTitle = str3;
        this.value = str4;
        this.preview = str5;
    }

    public WizardSubTemplateObject(String str, String str2, String str3, ArrayList<KeyValue> arrayList) {
        this.imageUrl = str;
        this.title = str2;
        this.subTitle = str3;
        this.keyValues = arrayList;
    }
}
