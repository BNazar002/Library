package com.bn.clients.user.dto;

import com.bn.clients.constant.RoleData;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JwtParseResponseDto {
    private String username;
    private List<RoleData> roleData;
}
