package com.personal.xmlmodels;

import java.time.ZonedDateTime;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

//11/06/23
// <?xml version="1.0" encoding="utf-8"?>
// <GetSellerListRequest xmlns="urn:ebay:apis:eBLBaseComponents">
//   <!-- Call-specific Input Fields -->
//   <AdminEndedItemsOnly> boolean </AdminEndedItemsOnly>
//   <CategoryID> int </CategoryID>
//   <EndTimeFrom> dateTime </EndTimeFrom>
//   <EndTimeTo> dateTime </EndTimeTo>
//   <GranularityLevel> GranularityLevelCodeType </GranularityLevel>
//   <IncludeVariations> boolean </IncludeVariations>
//   <IncludeWatchCount> boolean </IncludeWatchCount>
//   <MotorsDealerUsers> UserIDArrayType
//     <UserID> UserIDType (string) </UserID>
//     <!-- ... more UserID values allowed here ... -->
//   </MotorsDealerUsers>
//   <Pagination> PaginationType
//     <EntriesPerPage> int </EntriesPerPage>
//     <PageNumber> int </PageNumber>
//   </Pagination>
//   <SKUArray> SKUArrayType
//     <SKU> SKUType (string) </SKU>
//     <!-- ... more SKU values allowed here ... -->
//   </SKUArray>
//   <Sort> int </Sort>
//   <StartTimeFrom> dateTime </StartTimeFrom>
//   <StartTimeTo> dateTime </StartTimeTo>
//   <!-- Standard Input Fields -->
//   <DetailLevel> DetailLevelCodeType </DetailLevel>
//   <!-- ... more DetailLevel values allowed here ... -->
//   <ErrorLanguage> string </ErrorLanguage>
//   <MessageID> string </MessageID>
//   <OutputSelector> string </OutputSelector>
//   <!-- ... more OutputSelector values allowed here ... -->
//   <Version> string </Version>
//   <WarningLevel> WarningLevelCodeType </WarningLevel>
// </GetSellerListRequest>

@Data
@XmlRootElement(name = "getSellerListRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetSellerListRequest {
    
    private Boolean adminEndedItemsOnly;
    private Integer categoryId;
    private ZonedDateTime endTimeFrom;
    private ZonedDateTime endTimeTo;
    private String granularityLevel;
    private Boolean includeVariations;
    private Boolean includeWatchCount;
    //private List<Integer>  


    private ZonedDateTime startTimeFrom;
    private ZonedDateTime startTimeTo;

}
