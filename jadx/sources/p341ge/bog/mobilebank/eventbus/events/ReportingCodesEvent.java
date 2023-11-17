package p341ge.bog.mobilebank.eventbus.events;

import java.util.List;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.foreigntransfer.ReportingCode;

/* renamed from: ge.bog.mobilebank.eventbus.events.ReportingCodesEvent */
public class ReportingCodesEvent extends RootEvent {
    public List<ReportingCode> reportingCodes;
}
