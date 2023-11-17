package p341ge.bog.mobilebank.model.template;

import java.util.ArrayList;
import p341ge.bog.mobilebank.model.KeyValue;

/* renamed from: ge.bog.mobilebank.model.template.CarCTParkResponse */
public class CarCTParkResponse {
    private ArrayList<KeyValue[]> fines;
    private ArrayList<KeyValue[]> ignoredFines;

    public ArrayList<KeyValue[]> getFines() {
        return this.fines;
    }

    public ArrayList<KeyValue[]> getIgnoredFines() {
        return this.ignoredFines;
    }
}
