package com.zerobase.nsbackend.errand.dto;

import com.zerobase.nsbackend.errand.domain.entity.Errand;
import com.zerobase.nsbackend.errand.domain.vo.PayDivision;
import com.zerobase.nsbackend.global.dto.AddressDto;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class ErrandDto {
  private Long id;
  private String title;
  private String content;
  private List<String> images;
  private PayDivision payDivision;
  private Integer pay;
  private List<String> hashtags;
  private AddressDto address;
  private LocalDateTime createdAt;

  public static ErrandDto from(Errand errand) {
    return ErrandDto.builder()
        .id(errand.getId())
        .title(errand.getTitle())
        .content(errand.getContent())
        .images(errand.getImagesAsStringList())
        .payDivision(errand.getPayDivision())
        .pay(errand.getPay())
        .hashtags(errand.getHashtagsAsStringList())
        .address(AddressDto.from(errand.getAddress()))
        .build();
  }
}
