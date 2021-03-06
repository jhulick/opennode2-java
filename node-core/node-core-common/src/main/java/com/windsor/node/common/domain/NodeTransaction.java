/*
Copyright (c) 2009, The Environmental Council of the States (ECOS)
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

 * Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
 * Neither the name of the ECOS nor the names of its contributors may
   be used to endorse or promote products derived from this software
   without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
 */

package com.windsor.node.common.domain;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class NodeTransaction extends AuditableIdentity {

    private static final long serialVersionUID = 2;
    private DataFlow flow;
    private String networkId;
    private TransactionStatus status;
    private List<Document> documents;
    private DataRequest request;
    private String operation;
    private NodeMethodType webMethod;
    private UserAccount creator;
    private EndpointVersionType endpointVersion;
    private EndpointVersionType networkEndpointVersion;
    private URL networkEndpointUrl;
    private String networkEndpointStatus;
    private String networkEndpointStatusDetail;

    public NodeTransaction() {
        status = new TransactionStatus(CommonTransactionStatusCode.Unknown);
        this.documents = new ArrayList<Document>();
    }

    /**
     * Adds all implemented partner details to a transaction object.  
     * Interim refactoring method, these details do not all get set and will be implemented over time.
     * @param partner
     */
    public void updateWithPartnerDetails(PartnerIdentity partner)
    {
        setNetworkEndpointVersion(partner.getVersion());
        setNetworkEndpointUrl(partner.getUrl());
        //TODO what do I do with the status and status detail?
        //tran.setNetworkEndpointStatus(networkEndpointVersion);
        //tran.setNetworkEndpointStatusDetail(networkEndpointVersion);
    }

    public DataFlow getFlow() {
        return flow;
    }

    public void setFlow(DataFlow flow) {
        this.flow = flow;
    }

    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    /**
     * List must be of type <Document>
     * 
     * @param documents
     */
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public DataRequest getRequest() {
        return request;
    }

    public void setRequest(DataRequest request) {
        this.request = request;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public NodeMethodType getWebMethod() {
        return webMethod;
    }

    public void setWebMethod(NodeMethodType webMethod) {
        this.webMethod = webMethod;
    }

    public UserAccount getCreator() {
        return creator;
    }

    public void setCreator(UserAccount creator) {
        this.creator = creator;
    }

    // CHECKSTYLE:OFF
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((creator == null) ? 0 : creator.hashCode());
        result = prime * result
                + ((documents == null) ? 0 : documents.hashCode());
        result = prime * result + ((flow == null) ? 0 : flow.hashCode());
        result = prime * result
                + ((networkId == null) ? 0 : networkId.hashCode());
        result = prime * result
                + ((operation == null) ? 0 : operation.hashCode());
        result = prime * result + ((request == null) ? 0 : request.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result
                + ((webMethod == null) ? 0 : webMethod.hashCode());
        result = prime * result
                + ((endpointVersion == null) ? 0 : endpointVersion.hashCode());
        result = prime * result
                + ((networkEndpointVersion == null) ? 0 : networkEndpointVersion.hashCode());
        result = prime * result
                + ((networkEndpointUrl == null) ? 0 : networkEndpointUrl.hashCode());
        result = prime * result
                + ((networkEndpointStatus == null) ? 0 : networkEndpointStatus.hashCode());
        result = prime * result
                + ((networkEndpointStatusDetail == null) ? 0 : networkEndpointStatusDetail.hashCode());
        return result;
    }

    // CHECKSTYLE:ON

    // CHECKSTYLE:OFF
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        final NodeTransaction other = (NodeTransaction) obj;
        if (creator == null) {
            if (other.creator != null)
                return false;
        } else if (!creator.equals(other.creator))
            return false;
        if (documents == null) {
            if (other.documents != null)
                return false;
        } else if (!documents.equals(other.documents))
            return false;
        if (flow == null) {
            if (other.flow != null)
                return false;
        } else if (!flow.equals(other.flow))
            return false;
        if (networkId == null) {
            if (other.networkId != null)
                return false;
        } else if (!networkId.equals(other.networkId))
            return false;
        if (operation == null) {
            if (other.operation != null)
                return false;
        } else if (!operation.equals(other.operation))
            return false;
        if (request == null) {
            if (other.request != null)
                return false;
        } else if (!request.equals(other.request))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (webMethod == null) {
            if (other.webMethod != null)
                return false;
        } else if (!webMethod.equals(other.webMethod))
            return false;
        if (endpointVersion == null) {
            if (other.endpointVersion != null)
                return false;
        } else if (!endpointVersion.equals(other.endpointVersion))
            return false;
        if (networkEndpointVersion == null) {
            if (other.networkEndpointVersion != null)
                return false;
        } else if (!networkEndpointVersion.equals(other.networkEndpointVersion))
            return false;
        if (networkEndpointUrl == null) {
            if (other.networkEndpointUrl != null)
                return false;
        } else if (!networkEndpointUrl.equals(other.networkEndpointUrl))
            return false;
        if (networkEndpointStatus == null) {
            if (other.networkEndpointStatus != null)
                return false;
        } else if (!networkEndpointStatus.equals(other.networkEndpointStatus))
            return false;
        if (networkEndpointStatusDetail == null) {
            if (other.networkEndpointStatusDetail != null)
                return false;
        } else if (!networkEndpointStatusDetail.equals(other.networkEndpointStatusDetail))
            return false;
        return true;
    }

    // CHECKSTYLE:ON

    public String toString() {
        ReflectionToStringBuilder rtsb = new ReflectionToStringBuilder(this,
                new DomainStringStyle());
        rtsb.setAppendStatics(false);
        rtsb.setAppendTransients(false);
        return rtsb.toString();
    }

    public EndpointVersionType getNetworkEndpointVersion()
    {
        return networkEndpointVersion;
    }

    public void setNetworkEndpointVersion(EndpointVersionType networkEndpointVersion)
    {
        this.networkEndpointVersion = networkEndpointVersion;
    }

    public String getNetworkEndpointStatus()
    {
        return networkEndpointStatus;
    }

    public void setNetworkEndpointStatus(String networkEndpointStatus)
    {
        this.networkEndpointStatus = networkEndpointStatus;
    }

    public String getNetworkEndpointStatusDetail()
    {
        return networkEndpointStatusDetail;
    }

    public void setNetworkEndpointStatusDetail(String networkEndpointStatusDetail)
    {
        this.networkEndpointStatusDetail = networkEndpointStatusDetail;
    }

    public URL getNetworkEndpointUrl()
    {
        return networkEndpointUrl;
    }

    public void setNetworkEndpointUrl(URL networkEndpointUrl)
    {
        this.networkEndpointUrl = networkEndpointUrl;
    }

    public EndpointVersionType getEndpointVersion()
    {
        return endpointVersion;
    }

    public void setEndpointVersion(EndpointVersionType endpointVersion)
    {
        this.endpointVersion = endpointVersion;
    }
}
