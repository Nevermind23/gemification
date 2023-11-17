package p341ge.bog.mobilebank.model.template;

import g91.C32359z0;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import p277ua.C8662a;
import p341ge.bog.mobilebank.eventbus.events.CTPark6MonthsEvent;
import p341ge.bog.mobilebank.eventbus.events.CTParkPenaltiesEvent;

/* renamed from: ge.bog.mobilebank.model.template.TemplateGroup */
public class TemplateGroup {
    @C8662a
    protected String channel;
    @C8662a
    protected List<TemplateGroupComment> comments;
    private CTPark6MonthsEvent ctPark6MonthsEvent;
    private CTParkPenaltiesEvent ctParkPenaltiesEvent;
    @C8662a
    protected String customerId;
    @C8662a
    protected String groupImage;
    @C8662a
    protected String groupName;
    @C8662a
    protected Integer groupOrder;
    @C8662a
    protected String groupType;
    @C8662a

    /* renamed from: id */
    protected Long f81379id;
    @C8662a
    private String operationKey;
    @C8662a
    protected String status;
    @C8662a
    protected List<TemplateBasketItem> templates;

    public String getChannel() {
        return this.channel;
    }

    public TemplateGroupComment getCommentGroupByType(String str) {
        if (getComments() == null) {
            return null;
        }
        for (TemplateGroupComment next : getComments()) {
            if (next.getCommentType() != null && next.getCommentType().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public List<TemplateGroupComment> getComments() {
        return this.comments;
    }

    public CTPark6MonthsEvent getCtPark6MonthsEvent() {
        return this.ctPark6MonthsEvent;
    }

    public CTParkPenaltiesEvent getCtParkPenaltiesEvent() {
        return this.ctParkPenaltiesEvent;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public String getGroupImage() {
        return this.groupImage;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public Integer getGroupOrder() {
        return this.groupOrder;
    }

    public String getGroupType() {
        return this.groupType;
    }

    public long getId() {
        Long l = this.f81379id;
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    public String getOperationKey() {
        return this.operationKey;
    }

    public int getPenaltiesAmount() {
        int i = 0;
        if (this.ctParkPenaltiesEvent.getState() == 20) {
            Iterator<TemplateBasketItem> it = this.ctParkPenaltiesEvent.getCTParkPenalties().iterator();
            while (it.hasNext()) {
                i += it.next().getDebtAmount();
            }
        }
        return i;
    }

    public String getStatus() {
        return this.status;
    }

    public List<TemplateBasketItem> getTemplates() {
        return this.templates;
    }

    public int getTotalCommission(TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig) {
        int i = 0;
        if (this.ctParkPenaltiesEvent.getState() == 20) {
            Iterator<TemplateBasketItem> it = this.ctParkPenaltiesEvent.getCTParkPenalties().iterator();
            while (it.hasNext()) {
                TemplateBasketItem next = it.next();
                try {
                    BigDecimal valueOf = BigDecimal.valueOf(((double) next.debtAmount) / 100.0d);
                    if (valueOf.compareTo(BigDecimal.ZERO) > 0) {
                        i += C32359z0.m95592t(valueOf, templateBasketItemsWithPaymentConfig.getConfig().get(next.getServiceId()).getCommission()).multiply(new BigDecimal(100)).intValue();
                    }
                } catch (Exception unused) {
                }
            }
        }
        return i;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setComments(List<TemplateGroupComment> list) {
        this.comments = list;
    }

    public void setCtPark6MonthsEvent(CTPark6MonthsEvent cTPark6MonthsEvent) {
        this.ctPark6MonthsEvent = cTPark6MonthsEvent;
    }

    public void setCtParkPenaltiesEvent(CTParkPenaltiesEvent cTParkPenaltiesEvent) {
        this.ctParkPenaltiesEvent = cTParkPenaltiesEvent;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setGroupImage(String str) {
        this.groupImage = str;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setGroupOrder(Integer num) {
        this.groupOrder = num;
    }

    public void setGroupType(String str) {
        this.groupType = str;
    }

    public void setId(long j) {
        this.f81379id = Long.valueOf(j);
    }

    public void setOperationKey(String str) {
        this.operationKey = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTemplates(List<TemplateBasketItem> list) {
        this.templates = list;
    }
}
