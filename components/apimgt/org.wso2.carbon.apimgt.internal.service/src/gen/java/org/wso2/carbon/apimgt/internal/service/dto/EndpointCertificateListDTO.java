package org.wso2.carbon.apimgt.internal.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.internal.service.dto.EndpointCertificateDTO;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;
import org.wso2.carbon.apimgt.rest.api.common.annotations.Scope;
import com.fasterxml.jackson.annotation.JsonCreator;

import javax.validation.Valid;



public class EndpointCertificateListDTO   {
  
    private List<EndpointCertificateDTO> certificates = new ArrayList<>();

  /**
   **/
  public EndpointCertificateListDTO certificates(List<EndpointCertificateDTO> certificates) {
    this.certificates = certificates;
    return this;
  }

  
  @ApiModelProperty(value = "")
      @Valid
  @JsonProperty("certificates")
  public List<EndpointCertificateDTO> getCertificates() {
    return certificates;
  }
  public void setCertificates(List<EndpointCertificateDTO> certificates) {
    this.certificates = certificates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointCertificateListDTO endpointCertificateList = (EndpointCertificateListDTO) o;
    return Objects.equals(certificates, endpointCertificateList.certificates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointCertificateListDTO {\n");
    
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

