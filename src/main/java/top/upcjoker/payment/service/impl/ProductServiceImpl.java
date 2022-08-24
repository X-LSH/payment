package top.upcjoker.payment.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.upcjoker.payment.entity.Product;
import top.upcjoker.payment.mapper.ProductMapper;
import top.upcjoker.payment.service.ProductService;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
