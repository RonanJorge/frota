package com.example.frota.caminhao;

import com.example.frota.marca.Marca;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-03T18:07:24-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class CaminhaoMapperImpl implements CaminhaoMapper {

    @Override
    public AtualizacaoCaminhao toAtualizacaoDto(Caminhao caminhao) {
        if ( caminhao == null ) {
            return null;
        }

        Long marcaId = null;
        Long id = null;
        String modelo = null;
        String placa = null;
        Integer ano = null;
        Double cargaMaxima = null;
        Double comprimento = null;
        Double largura = null;
        Double altura = null;
        Double fatorCubagem = null;

        marcaId = caminhaoMarcaId( caminhao );
        id = caminhao.getId();
        modelo = caminhao.getModelo();
        placa = caminhao.getPlaca();
        ano = caminhao.getAno();
        cargaMaxima = caminhao.getCargaMaxima();
        comprimento = caminhao.getComprimento();
        largura = caminhao.getLargura();
        altura = caminhao.getAltura();
        fatorCubagem = caminhao.getFatorCubagem();

        AtualizacaoCaminhao atualizacaoCaminhao = new AtualizacaoCaminhao( id, modelo, placa, ano, cargaMaxima, marcaId, comprimento, largura, altura, fatorCubagem );

        return atualizacaoCaminhao;
    }

    @Override
    public Caminhao toEntityFromAtualizacao(AtualizacaoCaminhao dto) {
        if ( dto == null ) {
            return null;
        }

        Caminhao caminhao = new Caminhao();

        caminhao.setMarca( idToMarca( dto.marcaId() ) );
        caminhao.setModelo( dto.modelo() );
        caminhao.setPlaca( dto.placa() );
        if ( dto.cargaMaxima() != null ) {
            caminhao.setCargaMaxima( dto.cargaMaxima() );
        }
        if ( dto.ano() != null ) {
            caminhao.setAno( dto.ano() );
        }
        if ( dto.comprimento() != null ) {
            caminhao.setComprimento( dto.comprimento() );
        }
        if ( dto.largura() != null ) {
            caminhao.setLargura( dto.largura() );
        }
        if ( dto.altura() != null ) {
            caminhao.setAltura( dto.altura() );
        }
        if ( dto.fatorCubagem() != null ) {
            caminhao.setFatorCubagem( dto.fatorCubagem() );
        }

        return caminhao;
    }

    @Override
    public void updateEntityFromDto(AtualizacaoCaminhao dto, Caminhao caminhao) {
        if ( dto == null ) {
            return;
        }

        caminhao.setMarca( idToMarca( dto.marcaId() ) );
        caminhao.setModelo( dto.modelo() );
        caminhao.setPlaca( dto.placa() );
        if ( dto.cargaMaxima() != null ) {
            caminhao.setCargaMaxima( dto.cargaMaxima() );
        }
        if ( dto.ano() != null ) {
            caminhao.setAno( dto.ano() );
        }
        if ( dto.comprimento() != null ) {
            caminhao.setComprimento( dto.comprimento() );
        }
        if ( dto.largura() != null ) {
            caminhao.setLargura( dto.largura() );
        }
        if ( dto.altura() != null ) {
            caminhao.setAltura( dto.altura() );
        }
        if ( dto.fatorCubagem() != null ) {
            caminhao.setFatorCubagem( dto.fatorCubagem() );
        }
    }

    private Long caminhaoMarcaId(Caminhao caminhao) {
        if ( caminhao == null ) {
            return null;
        }
        Marca marca = caminhao.getMarca();
        if ( marca == null ) {
            return null;
        }
        long id = marca.getId();
        return id;
    }
}
