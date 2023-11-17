package p341ge.bog.mobilebank.model.foreigntransfer;

import java.util.List;

/* renamed from: ge.bog.mobilebank.model.foreigntransfer.ForeignBankList */
public class ForeignBankList {
    private List<ForeignBank> list;
    private Summary summary;

    /* renamed from: ge.bog.mobilebank.model.foreigntransfer.ForeignBankList$Summary */
    public static class Summary {
        int count;
        int from;
        int totalCount;

        public int getCount() {
            return this.count;
        }

        public int getFrom() {
            return this.from;
        }

        public int getTotalCount() {
            return this.totalCount;
        }

        public void setCount(int i) {
            this.count = i;
        }

        public void setFrom(int i) {
            this.from = i;
        }

        public void setTotalCount(int i) {
            this.totalCount = i;
        }
    }

    public List<ForeignBank> getList() {
        return this.list;
    }

    public Summary getSummary() {
        return this.summary;
    }

    public void setList(List<ForeignBank> list2) {
        this.list = list2;
    }

    public void setSummary(Summary summary2) {
        this.summary = summary2;
    }
}
