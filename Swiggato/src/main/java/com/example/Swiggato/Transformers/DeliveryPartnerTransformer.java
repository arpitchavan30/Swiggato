package com.example.Swiggato.Transformers;

import com.example.Swiggato.DTO.RequestDTO.DeliveryPartnerRequest;
import com.example.Swiggato.DTO.ResponseDTO.DeliveryPartnerResponse;
import com.example.Swiggato.Models.DeliveryPartner;

import java.util.ArrayList;

public class DeliveryPartnerTransformer {

    public static DeliveryPartner DeliveryPartnerRequestToDeliveryPartner(DeliveryPartnerRequest deliveryPartnerRequest){
        return DeliveryPartner.builder()
                .name(deliveryPartnerRequest.getName())
                .mobileNo(deliveryPartnerRequest.getMobileNo())
                .gender(deliveryPartnerRequest.getGender())
                .orders(new ArrayList<>())
                .build();
    }

    public static DeliveryPartnerResponse DeliveryPartnerToDeliveryPartnerResponse(DeliveryPartner deliveryPartner){
        return DeliveryPartnerResponse.builder()
                .id(deliveryPartner.getId())
                .gender(deliveryPartner.getGender())
                .name(deliveryPartner.getName())
                .mobileNo(deliveryPartner.getMobileNo())
                .build();
    }
}
