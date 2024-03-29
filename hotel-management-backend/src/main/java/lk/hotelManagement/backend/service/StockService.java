package lk.hotelManagement.backend.service;


import lk.hotelManagement.backend.model.Stock;
import lk.hotelManagement.backend.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    StockRepository stockRepository;

    public List<Stock> stocks() {
        return stockRepository.stocks();
    }

    public boolean createStock(Stock stock) {
        return stockRepository.createStock(stock);
    }

    public Stock stockById(String stockId) {
        return stockRepository.stockById(stockId);

    }
    public boolean editStock( String stock_id,Stock stock){
        return stockRepository.editStock(stock_id,stock);

    }
    public boolean deleteStock(String stock_id){
        return stockRepository.deleteStock(stock_id);
    }

}
