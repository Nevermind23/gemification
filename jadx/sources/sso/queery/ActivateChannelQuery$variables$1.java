package sso.queery;

import java.util.LinkedHashMap;
import java.util.Map;
import p217q2.C7836g;
import p243s2.C8106f;

public final class ActivateChannelQuery$variables$1 extends C7836g.C7839c {
    final /* synthetic */ ActivateChannelQuery this$0;

    ActivateChannelQuery$variables$1(ActivateChannelQuery activateChannelQuery) {
        this.this$0 = activateChannelQuery;
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new ActivateChannelQuery$variables$1$marshaller$$inlined$invoke$1(this.this$0);
    }

    public Map<String, Object> valueMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ActivateChannelQuery activateChannelQuery = this.this$0;
        if (activateChannelQuery.getChannelId().f22756b) {
            linkedHashMap.put("channelId", activateChannelQuery.getChannelId().f22755a);
        }
        linkedHashMap.put("processReference", activateChannelQuery.getProcessReference());
        if (activateChannelQuery.getTmxSessionId().f22756b) {
            linkedHashMap.put("tmxSessionId", activateChannelQuery.getTmxSessionId().f22755a);
        }
        return linkedHashMap;
    }
}
