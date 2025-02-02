package com.marsview.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.marsview.domain.Lib;
import com.marsview.service.LibService;
import com.marsview.mapper.LibMapper;
import org.springframework.stereotype.Service;

/**
* @author yangshare
* @description 针对表【lib(自定义组件库表，用来满足自定义业务)】的数据库操作Service实现
* @createDate 2024-11-01 10:35:15
*/
@Service
public class LibServiceImpl extends ServiceImpl<LibMapper, Lib>
    implements LibService{

}




