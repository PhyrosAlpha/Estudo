import time

def count_time(label="No label"):
    def annotation_args(func):
        def wrapper(*args, **kwargs):
            start_time = time.time()
            result = func(*args, **kwargs)
            end_time = time.time()
            result_time = end_time - start_time
            print("Time - {} - {:.2f}".format(label, result_time))
            return result
        
        return wrapper
    return annotation_args
