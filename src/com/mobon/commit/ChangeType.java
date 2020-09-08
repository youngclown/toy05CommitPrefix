package com.mobon.commit;

public enum ChangeType {

  NEXT_GENERATION_DEVELOPMENT_ROOM_1("차세대개발실>R&D 1팀"),
  NEXT_GENERATION_DEVELOPMENT_ROOM_2("차세대개발실>R&D 2팀"),
  NEXT_GENERATION_DEVELOPMENT_ROOM_OPENRTB("차세대개발실>SSP 팀"),
  INFRASTRUCTURE_DEVELOPMENT_ROOM_1("인프라개발실>매체플랫폼팀"),
  INFRASTRUCTURE_DEVELOPMENT_ROOM_2("인프라개발실>고도화팀"),
  INFRASTRUCTURE_DEVELOPMENT_ROOM_3("인프라개발실>광고주플랫폼팀");

  public final String title;

  ChangeType(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }


}
