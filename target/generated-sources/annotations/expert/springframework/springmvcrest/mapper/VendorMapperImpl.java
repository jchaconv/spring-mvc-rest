package expert.springframework.springmvcrest.mapper;

import expert.springframework.springmvcrest.domain.Vendor;
import expert.springframework.springmvcrest.model.VendorDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-02-13T10:33:37-0500",
    comments = "version: 1.2.0.CR2, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class VendorMapperImpl implements VendorMapper {

    @Override
    public VendorDTO vendorToVendorDTO(Vendor vendor) {
        if ( vendor == null ) {
            return null;
        }

        VendorDTO vendorDTO = new VendorDTO();

        vendorDTO.setName( vendor.getName() );

        return vendorDTO;
    }

    @Override
    public Vendor vendorDTOtoVendor(VendorDTO vendorDTO) {
        if ( vendorDTO == null ) {
            return null;
        }

        Vendor vendor = new Vendor();

        vendor.setName( vendorDTO.getName() );

        return vendor;
    }
}
