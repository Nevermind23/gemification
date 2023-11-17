package p341ge.bog.mobilebank.model.usrinfo;

import hd0.C24978b;

/* renamed from: ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper */
public class ClientInfoWrapper {
    private String activePackageName;
    private UserInfo client;
    private ClientPlusLabelChange clientLabelChanges;
    public Boolean clientMustSeeDOConditions;
    private ClientStarInfo clientStarInfo;
    private C24978b isPlusStatusSegment;
    private String packageBadge;
    private VocativeNames vocativeNames;

    public String getActivePackageName() {
        return this.activePackageName;
    }

    public UserInfo getClient() {
        return this.client;
    }

    public ClientPlusLabelChange getClientPlusLabelChange() {
        return this.clientLabelChanges;
    }

    public ClientStarInfo getClientStarInfo() {
        return this.clientStarInfo;
    }

    public String getPackageBadge() {
        return this.packageBadge;
    }

    public VocativeNames getVocativeNames() {
        return this.vocativeNames;
    }

    public boolean isDSClient() {
        return this.client.isDSClient() && this.client.isRBClient();
    }

    public boolean isPlusStatusSegment() {
        C24978b bVar = this.isPlusStatusSegment;
        return bVar != null && bVar.mo63390c();
    }

    public boolean isRBClient() {
        return this.client.isRBClient();
    }

    public boolean isSolo() {
        return this.client.isSoloClient();
    }

    public boolean isSoloClub() {
        return this.client.isSoloClubClient(getActivePackageName());
    }

    public boolean isSoloX() {
        return this.client.isSoloXClient(getActivePackageName());
    }

    public boolean isWealth() {
        return this.client.isWealthClient();
    }

    public void setActivePackageName(String str) {
        this.activePackageName = str;
    }

    public void setClient(UserInfo userInfo) {
        this.client = userInfo;
    }

    public void setClientLabelChanges(ClientPlusLabelChange clientPlusLabelChange) {
        this.clientLabelChanges = clientPlusLabelChange;
    }

    public void setClientStarInfo(ClientStarInfo clientStarInfo2) {
        this.clientStarInfo = clientStarInfo2;
    }

    public void setIsPlusStatusSegment(C24978b bVar) {
        this.isPlusStatusSegment = bVar;
    }

    public void setPackageBadge(String str) {
        this.packageBadge = str;
    }

    public void setVocativeNames(VocativeNames vocativeNames2) {
        this.vocativeNames = vocativeNames2;
    }
}
